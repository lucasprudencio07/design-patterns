package com.alura.design_patterns.builder;

public class InvoiceTestMain {

    public static void main(String... args) {

        InvoiceBuilder invoiceCreator = new InvoiceBuilder();

        invoiceCreator.toCompany(".... Ltda")
                      .withNRJP("1000.435.163/1000-54")
                      .withItem(new NoteItems("Galaxy Note 10", 2900d))
                      .withItem(new NoteItems("Galaxy S20", 3900d))
                      .withItem(new NoteItems("iPhone 11 Pro Max", 5900d))
                      .withNote("No notes needed")
                      .withCurrentDate();

        Invoice invoice = invoiceCreator.build();

        System.out.println(invoice.getTotalGross());

    }

}
