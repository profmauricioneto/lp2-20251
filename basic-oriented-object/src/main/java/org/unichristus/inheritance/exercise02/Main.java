package org.unichristus.inheritance.exercise02;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(01, "Joeliton");
        Funcionario funcionario = new Funcionario(01, "Matheus");

        Venda produto1 = new Venda(cliente, funcionario);
        System.out.println("Codigo da Venda: " + produto1.getCodigoVenda());
        System.out.println("Data da Venda: " + produto1.getDataVenda());

    }
}
