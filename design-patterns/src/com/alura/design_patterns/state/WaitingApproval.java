package com.alura.design_patterns.state;

import com.alura.design_patterns.Budget;

public class WaitingApproval implements BudgetState{

    @Override
    public void applyExtraDiscount(Budget budget) {
        budget.setValue(budget.getValue() - (budget.getValue() * 0.05));
    }

    @Override
    public void approve(Budget budget) {
        budget.setCurrentState(new Approved());
    }

    @Override
    public void reprove(Budget budget) {
        budget.setCurrentState(new Reproved());
    }

    @Override
    public void finish(Budget budget) {
        throw new RuntimeException("Budget can't be finished until they are approved or reproved");
    }

}
