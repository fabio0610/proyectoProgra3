package Controlador;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {
    public PasswordField clave;
    public TextField field;
    public Button ingresarBoton;
    public Label bloqueo;
    int contador=0;


    public void Button(ActionEvent actionEvent) {

        if (clave.getText().equals("1234") & field.getText().equals("pepito")){
            System.out.println("Ingresando...");
    }
        else{contador++;
            System.out.println("Datos Erroneos");
        }
    if(contador>=3){
        bloqueo.setText("Cuenta Bloqueada");
        ingresarBoton.setDisable(true);
        contador=0;
    }
    }
}

