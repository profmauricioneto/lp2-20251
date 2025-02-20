package org.unichristus.classrelationship.onetoone;

public class Teste {
    public static void main(String[] args) {
        Disciplina lp2 = new Disciplina("Linguagens 2", 1234);
        Professor mauricio = new Professor("Mauricio", 1, lp2);
        lp2.addProfessor(mauricio);

        System.out.println("A disciplina: " + lp2.getNomeDisciplina() + " é ministrada por " + lp2.getNomeProfessor());
    }
}
