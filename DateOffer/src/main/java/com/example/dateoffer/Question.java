// Question.java
package com.example.dateoffer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Question extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Question.class.getResource("Question.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        QuestionController questionController = fxmlLoader.getController();
        questionController.setPrimaryStage(stage);  // Set the primaryStage

        stage.setTitle("Answer needed!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
