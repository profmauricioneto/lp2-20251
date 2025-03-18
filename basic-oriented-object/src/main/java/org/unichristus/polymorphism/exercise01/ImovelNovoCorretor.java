package org.unichristus.polymorphism.exercise01;

public class ImovelNovoCorretor extends ImovelNovo {
    private double corretagem;

    public ImovelNovoCorretor(double preco, String endereco, double adicional, double corretagem) {
        super(preco, endereco, adicional);
        this.corretagem = corretagem;
    }

    @Override
    public double getPreco() {
        return (super.getPreco() + getAdicional() + super.getPreco()*corretagem/100.0);
    }
}
