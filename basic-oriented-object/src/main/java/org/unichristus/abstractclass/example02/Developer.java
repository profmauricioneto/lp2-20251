package org.unichristus.abstractclass.example02;

public class Developer extends Employee {
    @Override
    public void increaseSalary() {
        this.salary += 0.2*salary;
    }
}
