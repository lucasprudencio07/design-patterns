package com.alura.design_patterns.state;

import com.alura.design_patterns.Budget;

public class Reproved implements BudgetState {

    @Override
    public void applyExtraDiscount(Budget budget) {
        throw new RuntimeException("This state doesn't receive any discount");
    }

    @Override
    public void approve(Budget budget) {
        throw new RuntimeException("This budget is reproved, so it can't be approved");
    }

    @Override
    public void reprove(Budget budget) {
        throw new RuntimeException("This budget is already reproved");
    }

    @Override
    public void finish(Budget budget) {
        budget.setCurrentState(new Finished());
    }

}
