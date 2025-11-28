module com.example.assignment_05 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignment_05 to javafx.fxml;
    exports com.example.assignment_05;
}