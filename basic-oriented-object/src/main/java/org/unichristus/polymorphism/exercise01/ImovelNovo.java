package org.unichristus.polymorphism.exercise01;

public class ImovelNovo extends Imovel {
    private double adicional;

    public ImovelNovo(double preco, String endereco, double adicional) {
        super(preco, endereco);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return this.adicional;
    }

    @Override
    public double getPreco() {
        return this.adicional + super.getPreco();
    }
}
