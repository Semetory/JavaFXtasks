package com.example.calculate;

public class Procent {
    private float sum;

    public Procent(float sum) {
        this.sum = sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public float getSum() {
        return sum;
    }

    public float countPr(int pr) {
        return sum * pr / 100f;
    }

    public float countFix(int fix) {
        return sum / 100f + fix;
    }

    public float countSum(float sum, float pr) {
        return sum + (sum * pr / 100f);
    }

    public int countSumrnd(int pr) {
        float total = countSum(sum, pr);
        return Math.round(total);
    }

    public int countSumrndKup(int kup) {
        float total = sum + countPr(kup);
        return (int) (Math.ceil(total / kup) * kup);
    }
}
