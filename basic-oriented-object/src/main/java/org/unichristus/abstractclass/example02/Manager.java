package org.unichristus.abstractclass.example02;

public class Manager extends Employee {
    @Override
    public void increaseSalary() {
        this.salary += 0.1*salary;
    }
}
