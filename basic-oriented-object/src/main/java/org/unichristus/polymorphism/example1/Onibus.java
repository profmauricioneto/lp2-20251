package org.unichristus.polymorphism.example1;

public class Onibus extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Onibus acelerando...");
    }
    @Override
    public void frear() {
        System.out.println("Onibus freando...");
    }
}
