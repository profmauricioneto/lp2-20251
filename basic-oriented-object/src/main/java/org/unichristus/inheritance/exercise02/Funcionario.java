package org.unichristus.inheritance.exercise02;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {
    protected double salario;
    private List<Venda> vendas;

    public Funcionario(int codigo, String nome) {
        super(codigo);
        this.nome = nome;
        this.salario = 0;
        vendas = new ArrayList<>();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void addVenda(Venda venda) {
        vendas.add(venda);
    }
}
