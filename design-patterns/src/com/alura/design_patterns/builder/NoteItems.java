package com.alura.design_patterns.builder;

public class NoteItems {

    private String name;
    private Double value;

    // Constructor
    public NoteItems(String nome, Double valor) {
        this.name = nome;
        this.value = valor;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Double getValue() {
        return value;
    }
}
