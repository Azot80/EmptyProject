module com.example.emptyproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.emptyproject to javafx.fxml;
    exports com.example.emptyproject;
}