package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            System.out.println("Empezando");
            BorderPane root = FXMLLoader.load(getClass().getResource("/Ventana1.fxml"));
            Scene scene = new Scene(root,730,426);
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.setResizable(false);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

