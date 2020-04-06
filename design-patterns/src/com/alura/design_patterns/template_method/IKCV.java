package com.alura.design_patterns.template_method;

import com.alura.design_patterns.Budget;
import com.alura.design_patterns.Item;

public class IKCV extends ConditionalTaxTemplate {


    @Override
    public Double maxTaxRate(Budget budget) {
        return budget.getValue() * 0.1;
    }

    @Override
    public Double minTaxRate(Budget budget) {
        return budget.getValue() * 0.06;
    }

    @Override
    public Boolean useMaxTaxRate(Budget budget) {
        return budget.getValue() > 500 && isOneItemBiggerThan100(budget);
    }


    private Boolean isOneItemBiggerThan100 (Budget budget) {

        for (Item item : budget.getItemList()) {
            if (item.getValue() > 100) {
                return Boolean.TRUE;
            }

        }

        return Boolean.FALSE;
    }

}
