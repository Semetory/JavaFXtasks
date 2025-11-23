package com.example.calculate;

public class BigTipStrategy implements TipStrategy {
    @Override
    public float calculateTip(Procent procent) {
        return procent.countSum(procent.getSum(), 15);
    }
}
