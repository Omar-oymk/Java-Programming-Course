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

public class Question_06 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage)
    {
        // define labels
        Label label1 =  new Label("Investment Amount");
        Label label2 = new Label("Years");
        Label label3 = new Label("Annual Interest Rate");
        Label label4 = new Label("Future Value");

        // define textbox
        TextField investmentAmount = new TextField();
        TextField years = new TextField();
        TextField annualInterestRate = new TextField();
        TextField futureValue = new TextField();

        futureValue.setEditable(false);

        // define the button
        Button calculate = new Button("Calculate");

        calculate.setOnAction(new CalculateHandler(investmentAmount,years,annualInterestRate,futureValue));

        HBox row1 = new HBox(10);
        row1.getChildren().addAll(label1,investmentAmount);
        HBox row2 = new HBox(10);
        row2.getChildren().addAll(label2, years);
        HBox row3 = new HBox(10);
        row3.getChildren().addAll(label3, annualInterestRate);
        HBox row4 = new HBox(10);
        row4.getChildren().addAll(label4, futureValue);
        HBox row5 = new HBox(10);
        row5.getChildren().addAll(calculate);

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(row1, row2, row3, row4, row5);

        Scene scene = new Scene(vbox,300,200);
        stage.setScene(scene);
        stage.setTitle("Question_05");
        stage.show();
    }
}

class CalculateHandler implements EventHandler<ActionEvent>
{
    TextField investmentAmount;
    TextField years;
    TextField annualInterestRate;
    TextField futureValue;

    public CalculateHandler(TextField investmentAmount, TextField years, TextField annualInterestRate, TextField futureValue)
    {
        this.investmentAmount = investmentAmount;
        this.years = years;
        this.annualInterestRate = annualInterestRate;
        this.futureValue = futureValue;
    }

    @Override
    public void handle(ActionEvent event)
    {
        double ia =  Double.parseDouble(investmentAmount.getText());
        double y = Double.parseDouble(years.getText());
        double air = Double.parseDouble(annualInterestRate.getText());

        //futureValue = investmentAmount * (1 + monthlyInterestRate)years*12
        double fv = ia * (1 + air/12) * y * 12;

        futureValue.setText(Double.toString(fv));
    }
}
