package org.unichristus.review.exercise01;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nomeDisciplina;
    private int idDisciplina;
    private List<Estudante> estudantes;
    private Universidade universidade;

    public Disciplina(String nomeDisciplina, Universidade universidade) {
        this.universidade = universidade;
        this.nomeDisciplina = nomeDisciplina;
        this.idDisciplina = 0;
        this.estudantes = new ArrayList<>();
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }
    public int getIdDisciplina() {
        return idDisciplina;
    }
    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public void addEstudante(Estudante estudante) {
        this.estudantes.add(estudante);
    }

    public void getNomeEstudantes() {
        for(Estudante e: estudantes) {
            System.out.println(e.getNome());
        }
    }

    public int getTotalEstudantes() {
        return estudantes.size();
    }


}
