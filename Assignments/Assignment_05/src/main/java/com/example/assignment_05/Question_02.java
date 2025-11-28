package com.example.assignment_05;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Random;

public class Question_02 extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(100);
        grid.setVgap(100);
        grid.setPadding(new Insets(5, 5, 5, 5));

        Image image1 = new Image(getClass().getResource("/Question_02/X.jpeg").toExternalForm());
        Image image2 = new Image(getClass().getResource("/Question_02/O.png").toExternalForm());
        Image image3 = null;
        Image[] images = { image1, image2, image3 };        // image 3 acts as placeholder for empty image


        boolean[][] occupied = {{false, false, false},
                                {false, false, false},
                                {false, false, false}};
        Random rand = new Random();
        int choice;
        for(int i = 0; i < 6; i++)
        {
            int row, col;
            do
            {
                col = rand.nextInt(3);
                row = rand.nextInt(3);
            }while(occupied[row][col]);
            occupied[row][col] = true;


            choice = rand.nextInt(3);

            ImageView imageChosen;
            if(images[choice] != null)
            {
                imageChosen = new ImageView(images[choice]);
            }
            else
            {
                imageChosen = new ImageView();
            }
            imageChosen.setFitWidth(100);
            imageChosen.setFitHeight(100);
            grid.add(imageChosen, col, row);
        }

        Scene scene = new  Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
