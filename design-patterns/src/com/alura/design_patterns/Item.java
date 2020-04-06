package com.alura.design_patterns;

public class Item {

    private final Double value;
    private final String nome;

    public Item(String nome, Double value) {
        this.nome = nome;
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public String getNome() {
        return nome;
    }
}
