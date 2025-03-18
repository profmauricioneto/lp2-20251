package org.unichristus.inheritance.exercise03;

public class Main {
    public static void main(String[] args) {
        ContaCorrente  cc = new ContaCorrente("mauricio", 500, 200);
        cc.consultarSaldo();
        cc.depositar(500);
        cc.consultarSaldo();
        cc.sacar(1100);
        cc.consultarSaldo();
    }
}
