package com.alura.design_patterns.observer;

import com.alura.design_patterns.builder.Invoice;

public class Printer implements ActionAfterGenerateInvoice{

    private void printInvoice(Invoice invoice) {
        System.out.println("Sending the invoice to be printed");
    }

    @Override
    public void execute(Invoice invoice) {
        printInvoice(invoice);
    }

}
