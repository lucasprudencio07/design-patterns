package com.alura.design_patterns.strategy;

import com.alura.design_patterns.Budget;

public class ISS extends TaxAbsClass {

    public ISS() {
    }

    public ISS(TaxAbsClass anotherTax) {
        super(anotherTax);
    }

    @Override
    public Double calculate(Budget budget) {
        return budget.getValue() * 0.06 + calculateAnotherTax(budget);
    }

}
