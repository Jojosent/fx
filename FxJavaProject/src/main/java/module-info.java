module com.example.fxjavaproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxjavaproject to javafx.fxml;
    exports com.example.fxjavaproject;
}