package org.unichristus.inheritance.exercise01;

public class Pessoa {
    private int id;
    protected String nome;
    public Departamento departamento;

    public Pessoa(int id, Departamento departamento) {
        this.id = id;
        this.departamento = departamento;
        this.nome = "Indefinido";
    }

    protected int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDepartamentoId() {
        return id;
    }
}
