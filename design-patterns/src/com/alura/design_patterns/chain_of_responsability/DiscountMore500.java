package com.alura.design_patterns.chain_of_responsability;

import com.alura.design_patterns.Budget;

public class DiscountMore500 implements Discount {

    private Discount nextDiscount;

    @Override
    public Double discount(Budget budget) {

        if (budget.getValue() > 500) {
            return budget.getValue() * 0.07;
        }

        return nextDiscount.discount(budget);
    }

    @Override
    public void setNextDiscount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }

}
