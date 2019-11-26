package edu.ib;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TVdemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        /**
         * Basic stage build
         */

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/tvdemo.fxml")); //opis interfejsu użytkownika
        Scene scene = new Scene(root, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("TV Demo");
        primaryStage.show();




    }
}
