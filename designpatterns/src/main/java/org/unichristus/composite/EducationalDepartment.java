package org.unichristus.composite;

public class EducationalDepartment implements Departament {
    private int id;
    public String nameDepartament;

    public EducationalDepartment(int id, String nameDepartament) {
        this.id = id;
        this.nameDepartament = nameDepartament;
    }

    @Override
    public void printDepartment() {
        System.out.println(getClass().getSimpleName() + " ID: " + id);
    }
}
