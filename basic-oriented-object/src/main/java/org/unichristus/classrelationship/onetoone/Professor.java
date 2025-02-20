package org.unichristus.classrelationship.onetoone;

public class Professor {
    public String nomeProfessor;
    public int idProfessor;
    public Disciplina disciplina;

    public Professor(String nomeProfessor, int idProfessor, Disciplina disciplina) {
        this.nomeProfessor = nomeProfessor;
        this.idProfessor = idProfessor;
        this.disciplina = disciplina;
    }
}
