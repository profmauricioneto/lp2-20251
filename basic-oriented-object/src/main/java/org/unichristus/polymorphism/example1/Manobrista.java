package org.unichristus.polymorphism.example1;

public class Manobrista {
    public static void main(String[] args) {
        Veiculo grandeCircular = new Onibus();
        grandeCircular.acelerar();
        Veiculo bandeirantes = new Carro();
        bandeirantes.acelerar();
        Veiculo veiculoGenerico = new Veiculo();
        veiculoGenerico.acelerar();
    }
}
