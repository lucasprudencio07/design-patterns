package com.alura.design_patterns.observer;

import com.alura.design_patterns.builder.Invoice;
import com.alura.design_patterns.builder.NoteItems;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InvoiceObserverBuilder {

    private String socialReason;
    private String nrjp;
    private Double totalValue = 0d;
    private Double taxes = 0d;
    private String note;
    private LocalDate currentDate;
    private List<NoteItems> allItems = new ArrayList<>();
    private List<ActionAfterGenerateInvoice> listOfActionsToBeExecuted;

    public InvoiceObserverBuilder() {
        this.listOfActionsToBeExecuted = new ArrayList<>();
    }

    public void addAction(ActionAfterGenerateInvoice action) {
        listOfActionsToBeExecuted.add(action);
    }

    public InvoiceObserverBuilder toCompany(String socialReason) {
        this.socialReason = socialReason;
        return this;
    }

    public InvoiceObserverBuilder withNRJP(String nrjp) {
        this.nrjp = nrjp;
        return this;
    }

    public InvoiceObserverBuilder withItem(NoteItems item) {

        allItems.add(item);
        totalValue += item.getValue();
        taxes += item.getValue() * 0.05;
        return this;
    }

    public InvoiceObserverBuilder withNote (String note) {
        this.note = note;
        return this;
    }

    public InvoiceObserverBuilder withCurrentDate () {
        this.currentDate = LocalDate.now();
        return this;
    }

    public Invoice build() {

        Invoice in = new Invoice(socialReason, nrjp, currentDate, totalValue, taxes, allItems, note);
        listOfActionsToBeExecuted.forEach(action -> action.execute(in));
        return in;
    }

}
