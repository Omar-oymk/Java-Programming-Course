package com.example.assignment_05;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import java.io.IOException;

public class Question_01 extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(5, 5, 5, 5));

        Image image1 = new Image(getClass().getResource("/Question_01/british flag.jpeg").toExternalForm());
        Image image2 = new Image(getClass().getResource("/Question_01/canada-flag-background-vector.jpg").toExternalForm());
        Image image3 = new Image(getClass().getResource("/Question_01/china.jpeg").toExternalForm());
        Image image4 = new Image(getClass().getResource("/Question_01/usflag.jpeg").toExternalForm());
        ImageView imageView = new ImageView(image1);
        imageView.setFitWidth(400);
        imageView.setFitHeight(200);

        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitWidth(400);
        imageView2.setFitHeight(200);

        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitWidth(400);
        imageView3.setFitHeight(200);

        ImageView imageView4 = new ImageView(image4);
        imageView4.setFitWidth(400);
        imageView4.setFitHeight(200);


        grid.add(imageView, 0, 0);
        grid.add(imageView2, 1, 0);
        grid.add(imageView3, 0, 1);
        grid.add(imageView4, 1, 1);
        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Question_01");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
