    package com.example.assignment_06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Question_03 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        Pane pane = new Pane();

        pane.setOnMouseMoved(event -> {
            double x =  event.getX();
            double y = event.getY();
            stage.setTitle("(" + x + "," + y + ")");
        });

        Scene scene = new Scene(pane, 300, 200);
        stage.setScene(scene);
        stage.show();
    }
}