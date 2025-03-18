package org.unichristus.polymorphism.exercise01;

public class Imovel {
    private double preco;
    protected String endereco;

    public Imovel(double preco, String endereco) {
        this.preco = preco;
        this.endereco = endereco;
    }

    public double getPreco() {
        return this.preco;
    }
}
