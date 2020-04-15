package com.alura.design_patterns_II.factory;

public abstract class Plan {

    protected Double rate;

    abstract void getRate();

    public void calculateBill(int units) {

        System.out.println(units * rate);
    }

}
