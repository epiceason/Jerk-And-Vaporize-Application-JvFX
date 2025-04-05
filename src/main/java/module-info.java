module com.example.jerkandvaporizeapplicationjvfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.jerkandvaporizeapplicationjvfx to javafx.fxml;
    exports com.example.jerkandvaporizeapplicationjvfx;
}