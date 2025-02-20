package org.unichristus.classrelationship.exercise01;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    public String nomeCurso;
    public int codigo;
    List<Estudante> estudantes;
    Universidade universidade;

    public Curso(String nomeDisciplina, int codigo, Universidade universidade) {
        this.nomeCurso = nomeCurso;
        this.codigo = codigo;
        this.universidade = universidade;
        estudantes = new ArrayList<>();
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void addEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    public void getNomeEstudantes() {
        for (Estudante e : estudantes) {
            System.out.println(e.nomeEstudante);
        }
    }

    public int getTotalEstudantes() {
        return estudantes.size();
    }
}
