package Controlador;

import Modelo.Archivo;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ControllerLogin implements Runnable {
    public PasswordField clave;
    public TextField field;
    public Button ingresarBoton;
    public Label bloqueo;
    int contador = 0;
    Archivo archivo = new Archivo();
    int tam = archivo.leerArchivo().size();
    kitchenController kitchen;
    private Stage stageP;

    public ControllerLogin() {
    }

    public void setKitchen(kitchenController x) {
        kitchen = x;
    }

    public void setStageP(Stage x) {
        stageP = x;
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
                controllerMenu.setKitchen(kitchen);
                Scene scene = new Scene(root);
                stageP.setTitle("Orders");
                stageP.setScene(scene);
                stageP.show();
                Thread hilo = new Thread(this);
                hilo.start();

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
    private void addtoKitchen(String x){
        kitchen.kitchenList.getItems().add(x);
        kitchen.kitchenList.refresh();
    }

    @Override
    public void run() {

        try {
            ServerSocket servidor = new ServerSocket(9979);
            while (true) {
                Socket socket = servidor.accept();
                DataInputStream flujoEntrada = new DataInputStream(socket.getInputStream());
                String ordenRecibida = flujoEntrada.readUTF();
                Platform.runLater(() -> addtoKitchen(ordenRecibida));
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

