package org.unichristus;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Carro carroJoao = new Carro();

        System.out.println("Quantidade de portas: ");
        carroJoao.quantidadePortas = input.nextInt();

        System.out.println("Quantidade de Pneus: ");
        carroJoao.quantidadePneus = input.nextInt();

        System.out.println("Cor o Carro: ");
        carroJoao.cor = input.next();

        System.out.println("Carro do Joao: ");
        System.out.println("Qtd Portas: " + carroJoao.quantidadePortas);
        System.out.println("Qtde Pneus: " + carroJoao.quantidadePneus);
        System.out.println("Cor: " + carroJoao.cor);
    }
}