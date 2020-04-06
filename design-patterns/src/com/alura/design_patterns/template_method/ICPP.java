package com.alura.design_patterns.template_method;

import com.alura.design_patterns.Budget;

public class ICPP extends ConditionalTaxTemplate {


    @Override
    public Double maxTaxRate(Budget budget) {
        return budget.getValue() * 0.07;
    }

    @Override
    public Double minTaxRate(Budget budget) {
        return budget.getValue() * 0.05;
    }

    @Override
    public Boolean useMaxTaxRate(Budget budget) {
        return budget.getValue() > 500;
    }

}
