package com.alura.design_patterns.chain_of_responsability;

import com.alura.design_patterns.Budget;
import com.alura.design_patterns.Item;

public class TestDiscountsMain {

    public static void main(String... args) {

        DiscountCalculator discountCalculator = new DiscountCalculator();

        Budget budget = new Budget(600d);
        budget.addItem(new Item("WF-1000XM3", 1200d));
        budget.addItem(new Item("NH-U14", 150d));
        budget.addItem(new Item("Clamper", 50d));

        System.out.println("Total budget value = R$" + budget.getValue() +
                         "\nTotal of discounts = R$" + discountCalculator.calculateDiscount(budget));

    }

}
