package Controlador;

import Modelo.Archivo;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class ControllerLogin implements DataManagement {
    public PasswordField clave;
    public TextField field;
    public Button ingresarBoton;
    public Label bloqueo;
    int contador = 0;
    Archivo archivo = new Archivo();
    LocalDate fecha = LocalDate.now();

    public void escribirFecha() throws IOException {
        int dia = (int) Math.floor((Math.floor(Math.random() * (30 - 1 - 1) + 1)));
        int mes = (int) Math.floor((Math.floor(Math.random() * (12 - 1 - 1) + 1)));
        String leerArchivo = readOrdenes();
        leerArchivo = leerArchivo + (fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/2021\n");
        writeOrdenes(leerArchivo);
    }

    public boolean recorreLista() {
        for (int i = 0; i < archivo.leerArchivo().size(); i++) {
            if (field.getText().equals(archivo.leerArchivo().get(i).getUsername()) &&
                    clave.getText().equals(archivo.leerArchivo().get(i).getPassword())) {
                return true;
            }
        }
        return false;
    }

    public void Button(ActionEvent actionEvent) {
        if (recorreLista()) {
            try {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Vista/PrincipalView.fxml")));
                Stage stage = new Stage();
                Scene scene = new Scene(root);
                stage.setTitle("Orders");
                stage.setScene(scene);
                stage.show();
                escribirFecha();

            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else {
            bloqueo.setText("Mensajito");
            contador++;
            field.clear();
            clave.clear();
        }
        if (contador >= 3) {
            bloqueo.setText("Cuenta Bloqueada");
            ingresarBoton.setDisable(true);
            contador = 0;
        }
    }

    @Override
    public String readOrdenes() throws IOException {
        String mensaje = "";
        String ruta = "OrdenesListas.txt";
        Path path = Paths.get(ruta);
        if (Files.exists(path)) {
            List<String> x = Files.readAllLines(path, StandardCharsets.UTF_8);
            for (int i = 0; i < x.size(); i++) {
                mensaje = mensaje + x.get(i) + "\n";
            }
            return mensaje;
        } else
            writeOrdenes("");
        return "";
    }

    @Override
    public void writeOrdenes(String mensaje) throws IOException {
        String ruta = "OrdenesListas.txt";
        File f = new File(ruta);
        FileWriter fw = new FileWriter(f);
        BufferedWriter escritura = new BufferedWriter(fw);
        escritura.write(mensaje);
        escritura.newLine();

        escritura.close();
    }
}

