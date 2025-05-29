package org.unichristus.composite;

public class SalesDepartment implements Departament {
    private int id;
    public String nameDepartament;

    public SalesDepartment(int id, String nameDepartament) {
        this.id = id;
        this.nameDepartament = nameDepartament;
    }

    @Override
    public void printDepartment() {
        System.out.println(getClass().getSimpleName() + " ID: " + id);
    }
}
