package Controlador;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("../Vista/kitchenView.fxml"));
        Parent root2 = loader2.load();
        kitchenController kitchen = loader2.getController();
        Stage stage2 = new Stage();
        Scene scene2 = new Scene(root2);
        stage2.setTitle("Kitchen");
        stage2.setScene(scene2);
        stage2.show();
        primaryStage.show();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../Vista/login.fxml"));
        Parent root = loader.load();
        ControllerLogin controllerLogin = loader.getController();
        controllerLogin.setStageP(primaryStage);
        controllerLogin.setKitchen(kitchen);
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 330, 311));
    }


    public static void main(String[] args) {
        launch(args);
    }
}
