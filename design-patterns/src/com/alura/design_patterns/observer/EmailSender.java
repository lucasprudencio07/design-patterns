package com.alura.design_patterns.observer;

import com.alura.design_patterns.builder.Invoice;

public class EmailSender implements ActionAfterGenerateInvoice {

    private void sendEmail(Invoice invoice) {
        System.out.println("Sending the invoice through e-mails");
    }

    @Override
    public void execute(Invoice invoice) {
        sendEmail(invoice);
    }

}
