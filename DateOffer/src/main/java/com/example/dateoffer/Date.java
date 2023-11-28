// Date.java
package com.example.dateoffer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Date extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;

        FXMLLoader fxmlLoader = new FXMLLoader(Date.class.getResource("Date.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        DateController dateController = fxmlLoader.getController();
        dateController.setPrimaryStage(primaryStage);

        stage.setTitle("Lets Goooooo!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
