package org.unichristus.abstractclass.example02;

public class Main {
    public static void main(String[] args) {
        Employee dev = new Developer();
        dev.setSalary(4000);
        Employee manager = new Manager();
        manager.setSalary(4000);

        dev.increaseSalary();
        manager.increaseSalary();

        System.out.println("Salario do Dev: " + dev.getSalary());
        System.out.println("Salario do Manager: " + manager.getSalary());
    }
}
