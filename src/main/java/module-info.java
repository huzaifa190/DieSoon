module com.example.diesoon {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.diesoon to javafx.fxml;
    exports com.example.diesoon;
}