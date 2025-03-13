package org.unichristus.inheritance.exercise01;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private int idDepartamento;
    public String descricao;
    public List<Pessoa> pessoas;

    public Departamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
        this.descricao = "Indefinida";
        pessoas = new ArrayList<Pessoa>();
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void addPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }
}
