package org.unichristus.encapsulation;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo Insuficiente");
        } else {
            saldo -= valor;
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}
