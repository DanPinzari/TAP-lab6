package org.example.demolab6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml")); // Încărcarea fișierului FXML
        primaryStage.setTitle("Mingea se deplaseaza");
        primaryStage.setScene(new Scene(root, 800, 600));//scena pe baza rădăcinii definite în FXML
        primaryStage.show();
    }

    public static void main(String[] args) {// Punctul de intrare al aplicației JavaFX
        launch(HelloApplication.class, args);// Lansează aplicația JavaFX
    }
}
