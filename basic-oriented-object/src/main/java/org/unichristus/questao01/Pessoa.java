package org.unichristus.questao01;

import java.util.Calendar;

public class Pessoa {
    public String nome;
    public int anoNascimento;
    public double altura;

    public void imprimirEstados() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano: " + anoNascimento);
        System.out.println("Altura: " + altura);
    }

    public int calcularIdade() {
        Calendar calendar = Calendar.getInstance();
        int idade = calendar.get(Calendar.YEAR) - anoNascimento;
        return idade;
    }
}
