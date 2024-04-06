module com.example.transportapi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.transportapi to javafx.fxml;
    exports com.example.transportapi;
}