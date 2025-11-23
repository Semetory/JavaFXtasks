package com.example.calculate;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML private TextField TField;
    @FXML private Label LableBigProcent;
    @FXML private Label LableOrdinaryProcent;
    @FXML private Label LableSmallProcent;
    @FXML private Button ButtonBigProcent;
    @FXML private Button ButtonOrdinaryProcent;
    @FXML private Button ButtonSmallProcent;

    private Procent procent;

    @FXML
    public void initialize() {
        procent = new Procent(0);
    }

    @FXML
    protected void onBProcent() {
        setStrategyAndCalculate(new BigTipStrategy(), LableBigProcent);
    }

    @FXML
    protected void onOProcent() {
        setStrategyAndCalculate(new OrdinaryTipStrategy(), LableOrdinaryProcent);
    }

    @FXML
    protected void onSProcent() {
        setStrategyAndCalculate(new SmallTipStrategy(), LableSmallProcent);
    }

    private void setStrategyAndCalculate(TipStrategy strategy, Label label) {
        try {
            float sum = Float.parseFloat(TField.getText());
            procent.setSum(sum);
            float total = strategy.calculateTip(procent);
            label.setText(String.format("Итого к оплате: %.2f руб.", total));
        } catch (NumberFormatException e) {
            label.setText("Ошибка: введите число!");
        }
    }
}