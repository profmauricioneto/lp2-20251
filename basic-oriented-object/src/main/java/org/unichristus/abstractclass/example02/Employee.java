package org.unichristus.abstractclass.example02;

public abstract class Employee {
    protected String name;
    protected double salary;

    public Employee() {
        this.salary = 0.0;
        this.name = "unknown";
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public abstract void increaseSalary();
}
