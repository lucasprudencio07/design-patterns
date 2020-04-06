package com.alura.design_patterns.state;

import com.alura.design_patterns.Budget;

public interface BudgetState {

    void applyExtraDiscount(Budget budget);

    void approve(Budget budget);

    void reprove(Budget budget);

    void finish(Budget budget);
}
