package com.alura.design_patterns.observer;

import com.alura.design_patterns.builder.Invoice;
import com.alura.design_patterns.builder.NoteItems;

public class TestObserverMain {

    public static void main(String... args) {

        InvoiceObserverBuilder iob = new InvoiceObserverBuilder();

        iob.addAction(new EmailSender());
        iob.addAction(new SmsSender());
        iob.addAction(new Printer());
        iob.addAction(new SendDatabase());

        Invoice in = iob.toCompany("abc Ltda")
                        .withNRJP("4325.323.154/0001-67")
                        .withItem(new NoteItems("iPhone 11 Pro", 4900d))
                        .withCurrentDate()
                        .withNote("None")
                        .build();

        System.out.println(in.getTotalGross());
    }

}
