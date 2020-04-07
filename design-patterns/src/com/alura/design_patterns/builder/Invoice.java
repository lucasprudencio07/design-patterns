package com.alura.design_patterns.builder;

import java.time.LocalDate;
import java.util.List;

public class Invoice { // or NotaFiscal

    private String socialReason;
    private String nrjp; // this is the CNPJ, but on english lol
    private LocalDate emissionDate;
    private Double totalGross;
    private Double taxes;
    private List<NoteItems> itensNotaList;
    private String note;

    // Constructor
    public Invoice(String socialReason, String nrjp, LocalDate emissionData,
                   Double totalGross, Double taxes, List<NoteItems> itensNotaList, String obs) {
        this.socialReason = socialReason;
        this.nrjp = nrjp;
        this.emissionDate = emissionData;
        this.totalGross = totalGross;
        this.taxes = taxes;
        this.itensNotaList = itensNotaList;
        this.note = obs;
    }

    // Getters
    public String getSocialReason() {
        return socialReason;
    }

    public String getNrjp() {
        return nrjp;
    }

    public LocalDate getEmissionDate() {
        return emissionDate;
    }

    public Double getTotalGross() {
        return totalGross;
    }

    public Double getTaxes() {
        return taxes;
    }

    public List<NoteItems> getItensNotaList() {
        return itensNotaList;
    }

    public String getNote() {
        return note;
    }
}
