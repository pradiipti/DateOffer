package com.example.dateoffer;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class QuestionController {
    private Stage primaryStage;

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    protected void BtnClicked() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Question.class.getResource("Date.fxml"));
            Scene scene = new Scene(fxmlLoader.load());

            DateController dateController = fxmlLoader.getController();
            dateController.setPrimaryStage(primaryStage);

            primaryStage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
