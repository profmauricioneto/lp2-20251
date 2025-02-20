package org.unichristus.classrelationship.exercise01;

public class Estudante {
    public String nomeEstudante;
    public String matricula;
    public Curso curso;

    public Estudante(String nomeEstudante, String matricula, Curso curso) {
        this.nomeEstudante = nomeEstudante;
        this.matricula = matricula;
        this.curso = curso;
    }
}
