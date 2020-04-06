package com.alura.design_patterns.chain_of_responsability;

import com.alura.design_patterns.Budget;

public class DiscountCalculator {

    public Double calculateDiscount(Budget budget) {

        Discount discount01 = new DiscountFiveItems();
        Discount discount02 = new DiscountMore500();
        Discount discount03 = new NoDiscount();

        discount01.setNextDiscount(discount02);
        discount02.setNextDiscount(discount03);

        return discount01.discount(budget);
    }

}
