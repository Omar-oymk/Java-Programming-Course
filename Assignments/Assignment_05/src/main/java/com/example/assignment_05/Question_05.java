package com.example.assignment_05;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
    my approach will be to make a hbox having multiple vboxes where each have a rectangle and the label
    and set padding to be bottom
 */

public class Question_05 extends Application
{
    public void start(Stage primaryStage) throws Exception
    {
        HBox pane = new HBox(10);
        pane.setPadding(new Insets(5, 5, 5, 5));

        Text text1 = new Text("Project -- 20%");
        Text text2 = new Text("Quiz -- 10%");
        Text text3 = new Text("Midterm -- 30%");
        Text text4 = new Text("Final -- 40%");

        Rectangle rect1 = new Rectangle(100, 200);
        rect1.setFill(Color.RED);
        Rectangle rect2 = new Rectangle(100, 100);
        rect2.setFill(Color.BLUE);
        Rectangle rect3 = new Rectangle(100, 300);
        rect3.setFill(Color.GREEN);
        Rectangle rect4 = new Rectangle(100, 400);
        rect4.setFill(Color.ORANGE);

        VBox project = new VBox(10);
        project.setAlignment(Pos.BOTTOM_CENTER);
        project.getChildren().addAll(text1, rect1);

        VBox quiz = new VBox(10);
        quiz.setAlignment(Pos.BOTTOM_CENTER);
        quiz.getChildren().addAll(text2, rect2);

        VBox midterm = new VBox(10);
        midterm.setAlignment(Pos.BOTTOM_CENTER);
        midterm.getChildren().addAll(text3, rect3);

        VBox finals = new VBox(10);
        finals.setAlignment(Pos.BOTTOM_CENTER);
        finals.getChildren().addAll(text4, rect4);

        pane.getChildren().add(project);
        pane.getChildren().add(quiz);
        pane.getChildren().add(midterm);
        pane.getChildren().add(finals);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Question 05");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
