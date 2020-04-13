package com.alura.design_patterns.observer;

import com.alura.design_patterns.builder.Invoice;

public interface ActionAfterGenerateInvoice {

    void execute(Invoice invoice);
}
