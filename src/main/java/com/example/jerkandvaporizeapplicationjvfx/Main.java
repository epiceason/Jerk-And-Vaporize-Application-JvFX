package com.example.jerkandvaporizeapplicationjvfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();

        System.setProperty("prism.text", "t2k");

        URL url = getClass().getResource("/web/index.html");
        if (url != null) {
            webEngine.load(url.toExternalForm());
        } else {
            System.out.println("Missing Files!");
        }

        Scene scene = new Scene(webView, 1330, 780);
        stage.setScene(scene);
        stage.setTitle("OWSB Automated Purchase Order Management System");
        Image icon = new Image(getClass().getResourceAsStream("/web/images/icon.png"));
        stage.getIcons().add(icon);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
