package Controlador;

import Modelo.Archivo;
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

public class ControllerLogin implements DataManagement {
    public PasswordField clave;
    public TextField field;
    public Button ingresarBoton;
    public Label bloqueo;
    int contador = 0;
    Archivo archivo = new Archivo();
    LocalDate fecha = LocalDate.now();
    int tam = archivo.leerArchivo().size();

    public void escribirFecha() throws IOException {
        String leerArchivo = readOrdenes();
        leerArchivo = leerArchivo + (fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/2021\n");
        writeOrdenes(leerArchivo);
    }

    public boolean revisaLista() {
        for (int i = 0; i < tam; i++) {
            if (field.getText().equals(archivo.leerArchivo().get(i).getUsername()) &&
                    clave.getText().equals(archivo.leerArchivo().get(i).getPassword())) {
                return true;
            }
        }
        return false;
    }

    public void Button() {
        if (revisaLista()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../Vista/PrincipalView.fxml"));
                Parent root = loader.load();
                ControllerMenu controllerMenu = loader.getController();
                controllerMenu.empleadoNombre.setText(field.getText());
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
            contador++;
            bloqueo.setText("Datos Erroneos");
            field.clear();
            clave.clear();
            if (contador >= 3) {
                bloqueo.setText("Cuenta Bloqueada");
                ingresarBoton.setDisable(true);
                contador = 0;
            }
        }
    }

    @Override
    public String readOrdenes() throws IOException {
        StringBuilder mensaje = new StringBuilder();
        String ruta = "OrdenesListas.txt";
        Path path = Paths.get(ruta);
        if (Files.exists(path)) {
            List<String> x = Files.readAllLines(path, StandardCharsets.UTF_8);
            for (String s : x) {
                mensaje.append(s).append("\n");
            }
            return mensaje.toString();
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

