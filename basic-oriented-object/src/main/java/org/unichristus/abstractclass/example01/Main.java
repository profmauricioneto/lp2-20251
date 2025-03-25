package org.unichristus.abstractclass.example01;

public class Main {
    public static void main(String[] args) {
        Product bolaDoQuico = new Ball("Bola Quadrada do Quico", 100);
        Product barbie = new Toy("Barbie", 150);

        bolaDoQuico.update("Bola Quadrada do Quico", 200);
    }
}
