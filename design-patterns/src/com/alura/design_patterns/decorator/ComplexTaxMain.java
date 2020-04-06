package com.alura.design_patterns.decorator;

import com.alura.design_patterns.Budget;
import com.alura.design_patterns.strategy.ICMS;
import com.alura.design_patterns.strategy.ISS;
import com.alura.design_patterns.strategy.TaxAbsClass;
import com.alura.design_patterns.template_method.ICPP;

public class ComplexTaxMain {

    public static void main(String... args) {

        // impostos compostos de outros impostos
        TaxAbsClass composeTaxes = new ICMS(new ISS(new ICPP()));
        Budget budget = new Budget(500d);

        System.out.println(composeTaxes.calculate(budget));

    }

}
