package org.unichristus.inheritance.override;

public class Main {
    public static void main(String[] args) {
        B b = new B();

        b.metodo1(); // foi sobrescrito e da prioridade o da subclasse
        b.metodo2(); // so existe na superclasse
        b.metodo3(); // metodo exclusivo da subclasse B
//        b.metodo4();
    }
}
