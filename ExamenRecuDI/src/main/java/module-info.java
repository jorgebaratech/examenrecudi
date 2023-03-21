module com.mycompany.examenrecudi {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.examenrecudi to javafx.fxml;
    exports com.mycompany.examenrecudi;
}
