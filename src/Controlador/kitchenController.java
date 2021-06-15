package Controlador;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class kitchenController {
    public ListView<String> kitchenList = new ListView<>();
    public Label warningCocina;
    public Button marcarListo;

    void prueba(String x) {
        kitchenList.getItems().add(x);
    }

    public void BotonOrdenLista(ActionEvent actionEvent) {
        kitchenList.getItems().add("Hola");
        kitchenList.refresh();
    }
}
