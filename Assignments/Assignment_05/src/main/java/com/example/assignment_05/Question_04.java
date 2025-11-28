package com.example.assignment_05;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Question_04 extends Application
{
    public void start(Stage primaryStage) throws Exception
    {
        Pane pane = new Pane();
        String word = "WELCOME TO JAVA";
        // to draw in a circle we first have to know what is the equation of circle
        // x = r*cos(theta)
        // y = r*sin(theta)
        // we will draw in a circle of radius 100 and its center will be (200, 200)
        // to get degree at which we will draw the angle
        // 2*pi = full 360 degree
        // we want to divide the characters equally across this angles so
        // 1st character will be 2pi/total number of characters * 1
        // 2nd character will be at 2pi/total number of characters * 2
        // and so on...

        int centerX = 200;
        int centerY = 200;
        int r = 100;
        for(int i = 1; i < word.length() + 1; i++)
        {
            double angle = 2 * Math.PI / word.length() * i;
            Text text = new Text(Character.toString(word.charAt(i - 1)));
            text.setFont(Font.font("Times New Roman", 100));
            text.setX(centerX + r * Math.cos(angle));
            text.setY(centerY + r * Math.sin(angle));
            pane.getChildren().add(text);
        }

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Question 04");
        primaryStage.show();
    }
}
