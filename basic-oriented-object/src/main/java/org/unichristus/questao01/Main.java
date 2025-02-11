package org.unichristus.questao01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pessoa p1 = new Pessoa();

        System.out.println("Nome: ");
        p1.nome = scan.next();

        System.out.println("Ano de Nascimento: ");
        p1.anoNascimento = scan.nextInt();

        System.out.println("Altura: ");
        p1.altura = scan.nextDouble();

        System.out.println("Idade: " + p1.calcularIdade());
        p1.imprimirEstados();
    }
}
