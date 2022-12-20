package com.example.diesoon;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Driver extends Application {
    private static Stage mainStage;

    public static Stage getMainStage() {
        return mainStage;
    }

    @Override
    public void start(Stage stage) throws IOException {
        mainStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Driver.class.getResource("/com/example/diesoon/LoginIn.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        mainStage.setScene(scene);
        mainStage.setTitle("DieSoON");
        mainStage.setResizable(false);
        mainStage.show();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        launch();
    }
}