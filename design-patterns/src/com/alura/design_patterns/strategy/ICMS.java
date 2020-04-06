package com.alura.design_patterns.strategy;

import com.alura.design_patterns.Budget;

public class ICMS extends TaxAbsClass {

    public ICMS() {
    }

    public ICMS(TaxAbsClass anotherTax) {
        super(anotherTax);
    }

    @Override
    public Double calculate(Budget budget) {
        return budget.getValue() * 0.1 + calculateAnotherTax(budget);
    }

}
