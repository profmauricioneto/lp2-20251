package org.unichristus.classrelationship.manytomany;

public class Main {
    public static void main(String[] args) {
        Professor mauricio = new Professor("Mauricio", 123);
        Professor tiago = new Professor("Tiago", 456);

        Disciplina lp1 = new Disciplina("Linguagens 1", 1);
        Disciplina alg = new Disciplina("Algoritmos", 2);
        Disciplina poo = new Disciplina("Linguagens 2", 3);
        Disciplina tcc = new Disciplina("TCC", 4);

        mauricio.addDisciplina(lp1);
        mauricio.addDisciplina(poo);
        mauricio.addDisciplina(tcc);

        tiago.addDisciplina(alg);
        tiago.addDisciplina(tcc);

        lp1.addProfessor(mauricio);
        alg.addProfessor(tiago);
        tcc.addProfessor(mauricio);
        tcc.addProfessor(tiago);
        poo.addProfessor(mauricio);

        tcc.mostrarProfessoresDaDisciplina();
        System.out.println("Disciplinas Mauricio: ");
        mauricio.getNomeDisciplinas();
        System.out.println("Disciplinas Tiago: ");
        tiago.getNomeDisciplinas();

    }
}
