module com.java.serialization.serialiazation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.java.serialization.serialiazation to javafx.fxml;
    exports com.java.serialization.serialiazation;
}