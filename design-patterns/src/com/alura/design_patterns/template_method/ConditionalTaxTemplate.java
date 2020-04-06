package com.alura.design_patterns.template_method;

import com.alura.design_patterns.Budget;
import com.alura.design_patterns.strategy.TaxAbsClass;

public abstract class ConditionalTaxTemplate extends TaxAbsClass {


    @Override
    public Double calculate(Budget budget) {

        if (useMaxTaxRate(budget)) {
            return maxTaxRate(budget) + calculateAnotherTax(budget);
        }

        return minTaxRate(budget) + calculateAnotherTax(budget);
    }

    public abstract Double maxTaxRate(Budget budget);

    public abstract Double minTaxRate(Budget budget);

    public abstract Boolean useMaxTaxRate(Budget budget);

}
