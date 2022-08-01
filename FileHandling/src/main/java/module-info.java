module com.java.filehandling.filehandling {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.java.filehandling.filehandling to javafx.fxml;
    exports com.java.filehandling.filehandling;
}