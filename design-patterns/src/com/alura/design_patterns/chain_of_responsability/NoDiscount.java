package com.alura.design_patterns.chain_of_responsability;

import com.alura.design_patterns.Budget;

public class NoDiscount implements Discount {

    @Override
    public Double discount(Budget budget) {
        return 0d;
    }

    @Override
    public void setNextDiscount(Discount nextDiscount) {}

}
