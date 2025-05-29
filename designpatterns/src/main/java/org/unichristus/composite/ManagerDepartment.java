package org.unichristus.composite;

import java.util.ArrayList;
import java.util.List;

public class ManagerDepartment implements Departament {
    private int id;
    public String nameDepartament;
    public List<Departament> allDepartaments;

    public ManagerDepartment(int id, String nameDepartament) {
        this.id = id;
        this.nameDepartament = nameDepartament;
        this.allDepartaments = new ArrayList<>();
    }

    public void addDepartament(Departament departament) {
        this.allDepartaments.add(departament);
    }

    public void removeDepartament(Departament departament) {
        this.allDepartaments.remove(departament);
    }

    @Override
    public void printDepartment() {
        System.out.println(getClass().getSimpleName() + " ID: " + id);
        allDepartaments.forEach(Departament::printDepartment);
    }
}
