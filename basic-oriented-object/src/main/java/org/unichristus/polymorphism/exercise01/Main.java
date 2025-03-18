package org.unichristus.polymorphism.exercise01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Imovel apartamento;
        int option;

        System.out.print("Deseja comprar uma apartamento?\n1-imovel novo\n2-imovel novo corretor\n3-imovel velho\nresp:");
        option = scanner.nextInt();

        switch(option) {
            case 1: {
                System.out.print("Adicional:");
                double adicional = scanner.nextDouble();
                apartamento = new ImovelNovo(100000, "Rua lala", adicional);
                System.out.println(apartamento.getPreco());
                break;
            }
            case 2: {
                System.out.print("Adicional:");
                double adicional = scanner.nextDouble();
                System.out.print("Corretagem (%):");
                int corretagem = scanner.nextInt();
                apartamento = new ImovelNovoCorretor(100000, "Rua lala", adicional, corretagem);
                System.out.println(apartamento.getPreco());
                break;
            }
            case 3: {
                System.out.print("Desconto:");
                double desconto = scanner.nextDouble();
                apartamento = new ImovelVelho(100000, "Rua lala", desconto);
                System.out.println(apartamento.getPreco());
                break;
            }
            default: {
                System.out.println("Opcao invalida!");
            }
        }
    }
}
