package org.unichristus.classrelationship.onetomany;

public class Main {
    public static void main(String[] args) {
        Professor mauricio = new Professor("Maurício Neto", 123);
        Disciplina lp1 = new Disciplina("Linguagens 1", 01, mauricio);
        Disciplina poo = new Disciplina("Linguagens 2", 02, mauricio);
        Disciplina datavis = new Disciplina("Visualização", 03, mauricio);

        mauricio.addDisciplina(lp1);
        mauricio.addDisciplina(poo);
        mauricio.addDisciplina(datavis);

        System.out.println("Disciplinas ministradas por " + mauricio.getNomeProfessor());
        mauricio.getNomeDisciplinas();

    }
}
