package org.unichristus.classrelationship.onetomany;

public class Disciplina {
    public String nomeDisciplina;
    public int codigo;
    Professor professor;

    public Disciplina(String nomeDisciplina, int codigo, Professor professor) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigo = codigo;
        this.professor = professor;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public int getCodigo() {
        return codigo;
    }
}
