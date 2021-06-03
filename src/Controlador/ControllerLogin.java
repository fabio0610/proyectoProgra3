package Controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class ControllerLogin implements Initializable {
    public PasswordField clave;
    public TextField field;
    public Button ingresarBoton;
    public Label bloqueo;
    int contador=0;


    public void Button(ActionEvent actionEvent)  throws IOException {

        if (clave.getText().equals("1234") & field.getText().equals("pepito")){
           Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Vista/PrincipalView.fxml")));
            Stage stage=new Stage();
            Scene scene=new Scene(root);
            stage.setTitle("Orders");
            stage.setScene(scene);
            stage.show();
            Parent root2 = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Vista/kitchenView.fxml")));
            Stage stage2=new Stage();
            Scene scene2=new Scene(root2);
            stage2.setTitle("Kitchen");
            stage2.setScene(scene2);
            stage2.show();
    }
        else{contador++;
            bloqueo.setText("Datos Erroneos");
        }
    if(contador>=3){
        bloqueo.setText("Cuenta Bloqueada");
        ingresarBoton.setDisable(true);
        contador=0;
    }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

