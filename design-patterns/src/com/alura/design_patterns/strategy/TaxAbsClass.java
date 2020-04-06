package com.alura.design_patterns.strategy;

import com.alura.design_patterns.Budget;
import static java.util.Objects.nonNull;

public abstract class TaxAbsClass {

    protected TaxAbsClass anotherTax;

    public TaxAbsClass() {
    }

    public TaxAbsClass(TaxAbsClass anotherTax) {
        this.anotherTax = anotherTax;
    }

    public abstract Double calculate(Budget budget);

    protected Double calculateAnotherTax(Budget budget) {

        if (nonNull(anotherTax)) {
            return anotherTax.calculate(budget);
        }

        return 0d;
    }

}
