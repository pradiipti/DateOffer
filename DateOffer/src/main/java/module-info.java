module com.example.dateoffer {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                            
    opens com.example.dateoffer to javafx.fxml;
    exports com.example.dateoffer;
}