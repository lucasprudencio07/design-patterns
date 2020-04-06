package com.alura.design_patterns.chain_of_responsability;

import com.alura.design_patterns.Budget;

public class DiscountFiveItems implements Discount{

    private Discount nextDiscount;

    @Override
    public Double discount(Budget budget) {

        if (budget.getItemList().size() > 5) {
                return budget.getValue() * 0.1;
        }

        return nextDiscount.discount(budget);
    }

    @Override
    public void setNextDiscount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }

}
