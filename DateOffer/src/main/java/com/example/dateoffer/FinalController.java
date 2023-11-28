package com.example.dateoffer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FinalController {
    private Stage primaryStage;

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    @FXML
    private Label welcomeText;

    @FXML
    protected void btnclicked()
    {
        primaryStage.close();

    }
}
