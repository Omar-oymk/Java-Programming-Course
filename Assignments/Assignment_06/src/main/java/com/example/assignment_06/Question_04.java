package com.example.assignment_06;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Question_04 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // define textfield
        TextField textField =  new TextField();

        // define buttons
        Button upper =  new Button("UpperCase");
        Button lower = new Button("LowerCase");

        upper.setOnAction(new UpperButtonHandler(textField));
        lower.setOnAction(new LowerButtonHandler(textField));

        HBox row2 = new HBox();
        row2.getChildren().addAll(upper,lower);

        VBox vbox = new VBox();
        vbox.getChildren().addAll(textField,row2);

        Scene scene = new Scene(vbox,200,100);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Question_04");
        primaryStage.show();
    }
}

class UpperButtonHandler implements EventHandler<ActionEvent> {

    TextField textField;

    UpperButtonHandler(TextField textField) {
        this.textField = textField;
    }

    @Override
    public void handle(ActionEvent event)
    {
        textField.setText(textField.getText().toUpperCase());
    }
}

class LowerButtonHandler implements EventHandler<ActionEvent> {
    TextField textField;

    LowerButtonHandler(TextField textField) {
        this.textField = textField;
    }

    @Override
    public void handle(ActionEvent event)
    {
        textField.setText(textField.getText().toLowerCase());
    }
}
