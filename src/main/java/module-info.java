module org.example.customerregistration.customerregistration {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;

    opens org.example.customerregistration.customerregistration to javafx.fxml;
    exports org.example.customerregistration.customerregistration;
}