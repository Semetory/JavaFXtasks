package com.example.calculate;

public class OrdinaryTipStrategy implements TipStrategy {
    @Override
    public float calculateTip(Procent procent) {
        return procent.countSum(procent.getSum(), 10);
    }
}

