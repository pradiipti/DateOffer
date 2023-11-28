package com.example.dateoffer;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    private Stage primaryStage;

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    protected void onHelloButtonClick() {
        try {
            Question question = new Question();
            question.start(primaryStage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
