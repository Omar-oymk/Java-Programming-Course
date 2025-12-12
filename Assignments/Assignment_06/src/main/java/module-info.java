module com.example.assignment_06 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.assignment_06 to javafx.fxml;
    exports com.example.assignment_06;
}