package com.example.assignment_06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.*;

public class Question_02 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception
    {
        Pane pane = new Pane();
        pane.setOnMousePressed(event -> pane.setStyle("-fx-background-color: black;"));
        pane.setOnMouseReleased(event -> pane.setStyle("-fx-background-color: white;"));

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("Question_02");
        stage.show();
    }
}
