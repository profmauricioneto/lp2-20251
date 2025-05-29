package org.unichristus.composite;

public class FinancialDepartment implements Departament {
    private int id;
    public String nameDepartament;

    public FinancialDepartment(int id, String nameDepartament) {
        this.id = id;
        this.nameDepartament = nameDepartament;
    }

    @Override
    public void printDepartment() {
        System.out.println(getClass().getSimpleName() + " ID: " + id);
    }
}
