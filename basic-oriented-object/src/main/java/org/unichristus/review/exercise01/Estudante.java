package org.unichristus.review.exercise01;

public class Estudante {
    private String nome;
    private String matricula;
    private Disciplina disciplina;

    public Estudante(Disciplina disciplina) {
        this.nome = "indefinido";
        this.matricula = "indefinido";
        this.disciplina = disciplina;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
}
