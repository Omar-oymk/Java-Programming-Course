package com.example.assignment_05;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class Question_03 extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {
        HBox pane = new HBox(10);
        pane.setPadding(new Insets(10, 10, 10, 10));

        Random rand = new Random();
        double r;
        double g;
        double b;
        double opacity;

        for(int i = 0; i < 5; i++)
        {
            Text label = new Text("Java");
            label.setFont(Font.font("Times Roman", FontWeight.BOLD, 22));
            label.setRotate(90);
            r = rand.nextDouble();
            g = rand.nextDouble();
            b = rand.nextDouble();
            opacity = rand.nextDouble();

            label.setFill(Color.color(r, g, b, opacity));
            pane.getChildren().add(label);
        }

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("Question 03");
        stage.setResizable(false);
        stage.show();
    }
}
