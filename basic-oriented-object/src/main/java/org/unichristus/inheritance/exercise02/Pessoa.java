package org.unichristus.inheritance.exercise02;

public class Pessoa {
    private int codigo;
    protected String nome;

    public Pessoa(int codigo) {
        this.codigo = codigo;
        this.nome = "Indefinido";
    }

    public int getCodigo() {
        return codigo;
    }
}
