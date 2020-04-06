package com.alura.design_patterns.state;

import com.alura.design_patterns.Budget;

public class ExtraDiscountMain {

    public static void main(String... args) {

        Budget renew = new Budget(500d);
        System.out.println("Initial renew value R$" + renew.getValue());

        renew.applyExtraDiscount();
        System.out.println("Renew value when waiting for approval R$" + renew.getValue());

        renew.approve();
        renew.applyExtraDiscount();
        System.out.println("Renew value when approved R$" + renew.getValue());

        renew.finish();
        renew.applyExtraDiscount();

    }

}
