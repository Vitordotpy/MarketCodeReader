module com.example.marketcodereader {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.marketcodereader to javafx.fxml;
    exports com.example.marketcodereader;
}