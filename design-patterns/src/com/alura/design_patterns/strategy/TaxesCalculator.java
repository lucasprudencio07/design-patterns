package com.alura.design_patterns.strategy;

import com.alura.design_patterns.Budget;

public class TaxesCalculator {

    public void makeCalculation(Budget budget, TaxAbsClass taxType) {
            System.out.println(taxType.calculate(budget));
    }

}
