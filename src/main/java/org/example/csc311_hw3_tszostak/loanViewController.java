package org.example.csc311_hw3_tszostak;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class loanViewController {

    @FXML
    private Button btnCalculate;

    @FXML
    private HBox hbMain;

    @FXML
    private TextField tfInterestRate;

    @FXML
    private TextField tfLoanAmount;

    @FXML
    private TextField tfMonthlyPayment;

    @FXML
    private TextField tfNumYears;

    @FXML
    private TextField tfTotalPayment;

    @FXML
    private VBox vbLeftMain;

    @FXML
    private VBox vbMain;

    @FXML
    private VBox vbRightMain;

    double interestRate;
    double loanAmount;
    //double numOfYears;
    int months;
    double monthlyPayment;
    double totalPayment;

    @FXML
    void clickedCalculate(ActionEvent event) {
        loanAmount = Double.parseDouble(tfLoanAmount.getText());
        months = Integer.parseInt(tfNumYears.getText()) *12;
        interestRate = Double.parseDouble(tfInterestRate.getText())/100;
        monthlyPayment = loanAmount * ((interestRate * (Math.pow(1+interestRate, months)))/(Math.pow(1+interestRate, months)-1));
        totalPayment = monthlyPayment*months;


        tfMonthlyPayment.setText(String.valueOf(monthlyPayment));
        tfTotalPayment.setText(String.valueOf(totalPayment));
    }

}
