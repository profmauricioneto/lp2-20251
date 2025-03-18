package org.unichristus.polymorphism.exercise01;

public class ImovelVelho extends Imovel {
    private double desconto;

    public ImovelVelho(double preco, String endereco, double desconto) {
        super(preco, endereco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return this.desconto;
    }

    @Override
    public double getPreco() {
        return super.getPreco() - this.desconto;
    }
}
