module com.example.logimform_clone {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.logimform_clone to javafx.fxml;
    exports com.example.logimform_clone;
}