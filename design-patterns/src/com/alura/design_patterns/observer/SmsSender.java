package com.alura.design_patterns.observer;

import com.alura.design_patterns.builder.Invoice;

public class SmsSender implements ActionAfterGenerateInvoice{

    private void sendSMS(Invoice invoice) {
        System.out.println("Sending the invoice through SMS");
    }

    @Override
    public void execute(Invoice invoice) {
        sendSMS(invoice);
    }

}
