module com.example.marketcodereader {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires sqlite.jdbc;


    opens com.example.marketcodereader.models;
    opens com.example.marketcodereader to javafx.fxml;
    exports com.example.marketcodereader;
}