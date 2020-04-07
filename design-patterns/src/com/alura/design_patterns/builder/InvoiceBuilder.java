package com.alura.design_patterns.builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InvoiceBuilder {

    private String socialReason;
    private String nrjp;
    private List<NoteItems> allItems = new ArrayList<>();
    private Double totalValue = 0d;
    private Double taxes = 0d;
    private String note;
    private LocalDate currentDate;

    public InvoiceBuilder toCompany(String socialReason) {
        this.socialReason = socialReason;
        return this;
    }

    public InvoiceBuilder withNRJP(String nrjp) {
        this.nrjp = nrjp;
        return this;
    }

    public InvoiceBuilder withItem(NoteItems item) {

        allItems.add(item);
        totalValue += item.getValue();
        taxes += item.getValue() * 0.05;
        return this;
    }

    public InvoiceBuilder withNote (String note) {
        this.note = note;
        return this;
    }

    public InvoiceBuilder withCurrentDate () {
        this.currentDate = LocalDate.now();
        return this;
    }

    public Invoice build() {
        return new Invoice(socialReason, nrjp, currentDate, totalValue, taxes, allItems, note);
    }

}
