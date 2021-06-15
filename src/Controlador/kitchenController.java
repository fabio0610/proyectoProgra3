package Controlador;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class kitchenController implements DataManagement {
    public ListView<String> kitchenList = new ListView<>();
    public Label warningCocina;
    public Button marcarListo;

    public void BotonOrdenLista() throws IOException {
        if (kitchenList.getItems().size() <= 0) {
            warningCocina.setText("No hay pedidos");
            return;
        }

        if (kitchenList.getSelectionModel().getSelectedItem() != null) {
            warningCocina.setText("");
            String orden = kitchenList.getSelectionModel().getSelectedItem();
            writeOrdenes(readOrdenes() + orden.replaceFirst(" Pendiente", " Completado"));
            kitchenList.getItems().remove(kitchenList.getSelectionModel().getSelectedItem());
            kitchenList.refresh();
        } else {
            warningCocina.setText("No se ha seleccionado nada");
        }
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
}
