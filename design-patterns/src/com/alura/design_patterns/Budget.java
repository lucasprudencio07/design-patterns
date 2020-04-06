package com.alura.design_patterns;

import com.alura.design_patterns.state.BudgetState;
import com.alura.design_patterns.state.WaitingApproval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Budget {

    protected Double value;
    private List<Item> itemList;
    protected BudgetState currentState;


    // Constructor
    public Budget(Double value) {
        this.value = value;
        itemList = new ArrayList<Item>();
        currentState = new WaitingApproval();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }


    // Methods
    public List<Item> getItemList() {
        return Collections.unmodifiableList(itemList);
    }

    public void applyExtraDiscount() {
        currentState.applyExtraDiscount(this);
    }

    public void approve() {
        currentState.approve(this);
    }

    public void reprove() {
        currentState.reprove(this);
    }

    public void finish() {
        currentState.finish(this);
    }

    // Getters & Setters
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public BudgetState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(BudgetState currentState) {
        this.currentState = currentState;
    }


}
