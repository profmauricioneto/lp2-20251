package org.unichristus.encapsulation;

public class Main {
    public static void main(String[] args) {
        Conta contaCorrenteBB = new Conta(1000);
        System.out.println(contaCorrenteBB.consultarSaldo());
        contaCorrenteBB.depositar(3000);
        System.out.println(contaCorrenteBB.consultarSaldo());
        contaCorrenteBB.sacar(2000);
        System.out.println(contaCorrenteBB.consultarSaldo());
        contaCorrenteBB.sacar(3000);
    }
}
