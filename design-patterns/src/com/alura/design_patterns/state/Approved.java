package com.alura.design_patterns.state;

import com.alura.design_patterns.Budget;

public class Approved implements BudgetState{

    @Override
    public void applyExtraDiscount(Budget budget) {
        budget.setValue(budget.getValue() - (budget.getValue() * 0.02));
    }

    @Override
    public void approve(Budget budget) {
        throw new RuntimeException("This budget is already approved");
    }

    @Override
    public void reprove(Budget budget) {
        throw new RuntimeException("This budget is approved, so it can't be reproved");
    }

    @Override
    public void finish(Budget budget) {
        budget.setCurrentState(new Finished());
    }

}
