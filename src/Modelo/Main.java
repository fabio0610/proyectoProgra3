package Modelo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Vista/login.fxml")));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 330, 311));
        primaryStage.show();
        Parent root2 = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Vista/kitchenView.fxml")));
        Stage stage2 = new Stage();
        Scene scene2 = new Scene(root2);
        stage2.setTitle("Kitchen");
        stage2.setScene(scene2);
        stage2.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
