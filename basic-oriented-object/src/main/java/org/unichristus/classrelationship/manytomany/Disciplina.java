package org.unichristus.classrelationship.manytomany;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    public String nomeDisciplina;
    public int codigo;
    public List<Professor> professores;

    public Disciplina(String nomeDisciplina, int codigo) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigo = codigo;
        professores= new ArrayList<Professor>();
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public int getCodigo() {
        return codigo;
    }

    public void addProfessor(Professor professor) {
        professores.add(professor);
    }

    public void mostrarProfessoresDaDisciplina() {
        for(Professor p: professores) {
            System.out.println(p.getNomeProfessor());
        }
    }

}
