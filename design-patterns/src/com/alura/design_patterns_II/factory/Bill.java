package com.alura.design_patterns_II.factory;

public class Bill {

    public static void main(String[] args) {

        Plan domesticPlan = new PlanFactory().getPlan("DomesticPlan");
        domesticPlan.getRate();
        domesticPlan.calculateBill(300);
    }

}
