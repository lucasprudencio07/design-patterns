package com.alura.design_patterns.strategy;

import com.alura.design_patterns.Budget;

public class TestTaxesMain {

    public static void main(String... args) {

        TaxAbsClass icms = new ICMS();
        TaxAbsClass iss = new ISS();

        Budget budget = new Budget(500d);

        TaxesCalculator calculator = new TaxesCalculator();

        calculator.makeCalculation(budget, iss);
        calculator.makeCalculation(budget, icms);
    }

}
