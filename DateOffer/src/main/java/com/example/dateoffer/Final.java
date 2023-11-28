package com.example.dateoffer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Final extends Application {
    private Stage primaryStage;

    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;

        FXMLLoader fxmlLoader = new FXMLLoader(Final.class.getResource("Final.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        FinalController finalController = fxmlLoader.getController();
        finalController.setPrimaryStage(primaryStage);

        stage.setTitle("Hehehehe!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
