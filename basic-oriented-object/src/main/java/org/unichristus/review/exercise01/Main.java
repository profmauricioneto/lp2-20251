package org.unichristus.review.exercise01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Universidade unichristus = new Universidade("Centro Universitário Christus");
        System.out.print("Gostaria de fazer uma descricao?[s/n]");
        String opcao = scan.next();
        if (opcao.contains("s")) {
            System.out.print("Digite a descricao: ");
            String descricao = scan.nextLine();
            unichristus.setDescricao(descricao);
        } else {
            Disciplina[] disciplinas = new Disciplina[5];
            for(int i = 0; i < 5; i++) {
                disciplinas[i] = new Disciplina("Disciplina " + i, unichristus);
                disciplinas[i].setIdDisciplina(i);
            }
        // TODO...
        }
    }
}
