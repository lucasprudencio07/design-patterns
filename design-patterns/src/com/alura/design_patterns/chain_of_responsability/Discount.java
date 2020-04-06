package com.alura.design_patterns.chain_of_responsability;

import com.alura.design_patterns.Budget;

public interface Discount {

    Double discount(Budget budget);

    void setNextDiscount (Discount nextDiscount);
}
