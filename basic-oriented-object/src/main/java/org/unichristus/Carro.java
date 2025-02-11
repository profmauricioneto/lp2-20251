package org.unichristus;

public class Carro {
    // atributos
    public int quantidadePneus;
    public int quantidadePortas;
    public String cor;

    public Carro() {
        System.out.println("Construtor do Carro foi Chamado!");
    }

    // metodos
    public void acelerar() {
        System.out.println("Carro acelerado");
    }

    public void frear() {
        System.out.println("Carro freado");
    }
}
