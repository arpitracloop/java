module com.java.lambda.lambdaexpression {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.java.lambda.lambdaexpression to javafx.fxml;
    exports com.java.lambda.lambdaexpression;
}