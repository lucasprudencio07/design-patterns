package com.alura.design_patterns.state;

import com.alura.design_patterns.Budget;

public class Finished implements BudgetState {

    @Override
    public void applyExtraDiscount(Budget budget) {
        throw new RuntimeException("This state doesn't receive any discount, because it is finished");
    }

    @Override
    public void approve(Budget budget) {
        throw new RuntimeException("This budget is already finished, so it can't be approved");
    }

    @Override
    public void reprove(Budget budget) {
        throw new RuntimeException("This budget is already finished, so it can't be reproved");
    }

    @Override
    public void finish(Budget budget) {
        throw new RuntimeException("This budget is already finished");
    }

}
