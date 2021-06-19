package Controlador;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.sql.SQLException;

public class kitchenController {
    public ListView<String> kitchenList = new ListView<>();
    public Label warningCocina;
    public Button marcarListo;
    private final toMySQL mySQL = new toMySQL();

    public void BotonOrdenLista() throws SQLException {
        if (kitchenList.getItems().size() <= 0) {
            warningCocina.setText("No hay pedidos pendientes");
            return;
        }
        if (kitchenList.getSelectionModel().getSelectedItem() != null) {
            warningCocina.setText("");
            String orden = kitchenList.getSelectionModel().getSelectedItem();
            mySQL.ordenLista(returnCode(orden));
            kitchenList.getItems().remove(kitchenList.getSelectionModel().getSelectedItem());
            kitchenList.refresh();
        } else {
            warningCocina.setText("No se ha seleccionado nada");
        }
    }

    int returnCode(String orden) {
        int inde = orden.lastIndexOf("Codigo ");
        StringBuilder code = new StringBuilder();
        for (int i = inde + 7; i < inde + 12; i++) {
            code.append(orden.charAt(i));
        }
        return Integer.parseInt(code.toString());
    }


}
