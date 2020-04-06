package com.alura.design_patterns.template_method;

import com.alura.design_patterns.Budget;
import com.alura.design_patterns.Item;

public class TestTaxRateMain {

    public static void main(String... args) {

        Budget KeyboardBudget = new Budget(700d);
        KeyboardBudget.addItem(new Item ("Teclado Corsair Strafe", 600d));
        KeyboardBudget.addItem(new Item ("Teclado Corsair K65", 500d));

        ICPP icpp = new ICPP();
        System.out.println("ICPP tax over the budget = R$" + icpp.calculate(KeyboardBudget));

    }

}
