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

import java.io.IOException;
import java.util.Objects;

public class ControllerLogin  {
    public PasswordField clave;
    public TextField field;
    public Button ingresarBoton;
    public Label bloqueo;
    int contador = 0;
    Archivo archivo = new Archivo();

    public void Button(ActionEvent actionEvent) throws IOException {



     /*   if (clave.getText().equals("1234") & field.getText().equals("pepito")) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Vista/PrincipalView.fxml")));
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setTitle("Orders");
            stage.setScene(scene);
            stage.show();
            Parent root2 = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Vista/kitchenView.fxml")));
            Stage stage2 = new Stage();
            Scene scene2 = new Scene(root2);
            stage2.setTitle("Kitchen");
            stage2.setScene(scene2);
            stage2.show();
        }*/
        for (int i = 0; i < archivo.leerArchivo().size(); i++) {
            if (field.getText().equals(archivo.leerArchivo().get(i).getUsername()) &&
                    clave.getText().equals(archivo.leerArchivo().get(i).getPassword())) {
                try {

                    Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Vista/PrincipalView.fxml")));
                    Stage stage = new Stage();
                    Scene scene = new Scene(root);
                    stage.setTitle("Orders");
                    stage.setScene(scene);
                    stage.show();
                    Parent root2 = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Vista/kitchenView.fxml")));
                    Stage stage2 = new Stage();
                    Scene scene2 = new Scene(root2);
                    stage2.setTitle("Kitchen");
                    stage2.setScene(scene2);
                    stage2.show();

                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            } else if (!field.toString().equals(archivo.leerArchivo().get(i).getUsername()) &&
                    !clave.toString().equals(archivo.leerArchivo().get(i).getPassword())) {
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
    }
}

