package org.unichristus.polymorphism.example1;

public class Carro extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando...");
    }
    @Override
    public void frear() {
        System.out.println("Carro freando...");
    }
}
