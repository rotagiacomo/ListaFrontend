module com.example.listafrontend {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.listafrontend to javafx.fxml;
    exports com.example.listafrontend;
}