package com.alura.design_patterns.observer;

import com.alura.design_patterns.builder.Invoice;

public class SendDatabase implements ActionAfterGenerateInvoice{

    private void saveOnDatabase(Invoice invoice) {
        System.out.println("Saving the invoice on the database");
    }

    @Override
    public void execute(Invoice invoice) {
        saveOnDatabase(invoice);
    }

}
