
package com.example.dateoffer;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DateController {
    private Stage primaryStage;

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    private Button noButton;

    @FXML
    private AnchorPane dateAnchorPane;

    private TranslateTransition translateTransition;

    @FXML
    protected void onYesButton() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Final.class.getResource("Final.fxml"));
            AnchorPane finalAnchorPane = fxmlLoader.load();

            Scene finalScene = new Scene(finalAnchorPane);

            FinalController finalController = fxmlLoader.getController();
            finalController.setPrimaryStage(primaryStage);

            primaryStage.setScene(finalScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onNoButtonClick() {
        noButton.setVisible(false);
    }

}