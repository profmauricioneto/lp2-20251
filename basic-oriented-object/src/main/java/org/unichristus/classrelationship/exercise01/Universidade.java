package org.unichristus.classrelationship.exercise01;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    public String nomeUniversidade;
    public String descricao;
    List<Curso> cursos;

    public Universidade(String nomeUniversidade, String descricao) {
        this.nomeUniversidade = nomeUniversidade;
        this.descricao = descricao;
        cursos = new ArrayList<>();
    }

    public String getNomeUniversidade() {
        return nomeUniversidade;
    }

    public void addCurso(Curso curso) {
        cursos.add(curso);
    }

    public void getNomeCursos() {
        for (Curso c : cursos) {
            System.out.println(c.getNomeCurso());
        }
    }

    public int getTotalCursos() {
        return cursos.size();
    }

    public int getTotalEstudantesUniversidade() {
        int alunos = 0;
        for(Curso c: cursos) {
            alunos += c.getTotalEstudantes();
        }
        return alunos;
    }

    public static void main(String[] args) {
        Universidade unichristus = new Universidade("Unichristus", "Centro Universitário Chritus");

        Curso ads = new Curso("ADS", 01, unichristus);
        Curso si = new Curso("SI", 02, unichristus);
        Curso arquitetura = new Curso("Arquitetura", 03, unichristus);

        Estudante mauricio = new Estudante("Mauricio", "qwert", ads);
        Estudante maria = new Estudante("Maria", "qwert", ads);
        Estudante joao = new Estudante("Joao", "qwert", si);
        Estudante aristides = new Estudante("Aristides", "qwert", si);
        Estudante alba = new Estudante("Alba", "qwert", si);
        Estudante arimateia = new Estudante("Arimatéia", "qwert", arquitetura);

        si.addEstudante(joao);
        si.addEstudante(aristides);
        si.addEstudante(alba);
        arquitetura.addEstudante(arimateia);
        ads.addEstudante(mauricio);
        ads.addEstudante(maria);

        unichristus.addCurso(ads);
        unichristus.addCurso(si);
        unichristus.addCurso(arquitetura);

        System.out.println("Quantidade de Alunos na Universidade: " + unichristus.getTotalEstudantesUniversidade());
        System.out.println("Alunos de SI: ");
        si.getNomeEstudantes();

    }
}
