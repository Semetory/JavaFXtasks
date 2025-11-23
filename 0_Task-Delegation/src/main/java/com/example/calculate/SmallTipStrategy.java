package com.example.calculate;

public class SmallTipStrategy implements TipStrategy {
    @Override
    public float calculateTip(Procent procent) {
        return procent.countSum(procent.getSum(), 3);
    }
}
