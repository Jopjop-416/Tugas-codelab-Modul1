module com.example.uuuudemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uuuudemo to javafx.fxml;
    exports com.example.uuuudemo;
}