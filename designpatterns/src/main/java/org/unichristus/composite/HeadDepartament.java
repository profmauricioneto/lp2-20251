package org.unichristus.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartament implements Departament {
    private int id;
    public String nameDepartament;
    public List<Departament> departaments;

    public HeadDepartament(int id, String nameDepartament) {
        this.id = id;
        this.nameDepartament = nameDepartament;
        this.departaments = new ArrayList<>();
    }

    @Override
    public void printDepartment() {
        System.out.println(getClass().getSimpleName() + " ID: " + id);
        departaments.forEach(Departament::printDepartment);
    }

    public void addDepartament(Departament departament) {
        this.departaments.add(departament);
    }

    public void removeDepartament(Departament departament) {
        this.departaments.remove(departament);
    }
}
