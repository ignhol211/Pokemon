package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        try {
            BorderPane root = FXMLLoader.load(getClass().getResource("/ventana1.fxml"));
            Scene scene = new Scene(root,730,426);
            stage.setScene(scene);
            stage.show();
            stage.setResizable(false);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}

