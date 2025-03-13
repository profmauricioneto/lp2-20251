package org.unichristus.inheritance.exercise01;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(int id, String nome, Departamento departamento) {
        super(id, departamento);
        setNome(nome);
        this.cpf = "Indefinido";
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
