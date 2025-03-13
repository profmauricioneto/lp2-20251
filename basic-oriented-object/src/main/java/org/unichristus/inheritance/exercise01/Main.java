package org.unichristus.inheritance.exercise01;

public class Main {
    public static void main(String[] args) {
        Departamento POO = new Departamento(1);

        PessoaFisica mauricio = new PessoaFisica(01, "Mauricio", POO);
        PessoaFisica joeliton = new PessoaFisica(02, "Joeliton", POO);
        PessoaFisica lucas = new PessoaFisica(03, "Lucas", POO);

        POO.addPessoa(mauricio);
        POO.addPessoa(joeliton);
        POO.addPessoa(lucas);
    }
}
