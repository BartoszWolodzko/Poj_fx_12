module com.example.POJ_12lab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.POJ_12lab to javafx.fxml;
    exports com.example.POJ_12lab;
}