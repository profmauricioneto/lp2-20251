package org.unichristus.review.exercise01;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private String nomeUniversidade;
    private String descricao;
    private List<Disciplina> disciplinas;

    public Universidade(String nomeUniversidade) {
        this.nomeUniversidade = nomeUniversidade;
        this.descricao = "indefinido";
        this.disciplinas = new ArrayList<>();
    }

    public String getNomeUniversidade() {
        return nomeUniversidade;
    }

    public void setDescricao(String descricao) {
         this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }

    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public int getTotalDisciplinas() {
        return disciplinas.size();
    }

    public int getTotalEstudantes() {
        int totalEstudantes = 0;
        for(Disciplina d: disciplinas) {
            totalEstudantes += d.getTotalEstudantes();
        }
        return totalEstudantes;
    }
}
