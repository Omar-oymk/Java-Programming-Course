package com.example.assignment_06;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Question_01 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // define labels
        Label num1Label = new Label("Number 1");
        Label num2Label = new Label("Number 2");
        Label num3Label = new Label("Result");

        // define textFields
        TextField num1 = new TextField();
        TextField num2 = new TextField();
        TextField num3 = new TextField();
        num3.setEditable(false);

        // define buttons
        Button addButton = new Button("add");
        Button subtractButton = new Button("subtract");
        Button multiplyButton = new Button("multiply");
        Button divideButton = new Button("divide");

        addButton.setOnAction(new AddButtonHandler(num1, num2, num3));
        subtractButton.setOnAction(new SubtractButtonHandler(num1, num2, num3));
        multiplyButton.setOnAction(new MultiplyButtonHandler(num1, num2, num3));
        divideButton.setOnAction(new DivideButtonHandler(num1, num2, num3));

        // create a HBox for row 1
        HBox row1 = new HBox(10);
        row1.getChildren().addAll(num1Label, num1, num2Label, num2, num3Label, num3);

        // create a HBox for row2
        HBox row2 = new HBox(10);
        row2.getChildren().addAll(addButton, subtractButton, multiplyButton, divideButton);

        // create a VBox for the main layout
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(row1, row2);

        Scene scene = new Scene(vbox);
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.show();
    }
}

//region ButtonHandlers
class AddButtonHandler implements EventHandler<ActionEvent>
{
    private TextField num1;
    private TextField num2;
    private TextField result;

    public AddButtonHandler(TextField num1, TextField num2, TextField result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }

    @Override
    public void handle(ActionEvent event) {
        double x = Double.parseDouble(num1.getText());
        double y = Double.parseDouble(num2.getText());

        double sum =  x + y;

        result.setText(Double.toString(sum));
    }
}

class SubtractButtonHandler implements EventHandler<ActionEvent>
{
    private TextField num1;
    private TextField num2;
    private TextField result;

    public SubtractButtonHandler(TextField num1, TextField num2, TextField result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }

    @Override
    public void handle(ActionEvent event) {
        double x = Double.parseDouble(num1.getText());
        double y = Double.parseDouble(num2.getText());

        double sum =  x - y;
        result.setText(Double.toString(sum));
    }
}

class MultiplyButtonHandler implements EventHandler<ActionEvent>
{
    private TextField num1;
    private TextField num2;
    private TextField result;

    public MultiplyButtonHandler(TextField num1, TextField num2, TextField result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }

    @Override
    public void handle(ActionEvent event) {
        double x = Double.parseDouble(num1.getText());
        double y = Double.parseDouble(num2.getText());

        double sum =  x * y;
        result.setText(Double.toString(sum));
    }
}

class DivideButtonHandler implements EventHandler<ActionEvent>
{
    private TextField num1;
    private TextField num2;
    private TextField result;

    public DivideButtonHandler(TextField num1, TextField num2, TextField result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
    }

    @Override
    public void handle(ActionEvent event) {
        double x = Double.parseDouble(num1.getText());
        double y = Double.parseDouble(num2.getText());

        double sum =  x / y;
        result.setText(Double.toString(sum));
    }
}
//endregion