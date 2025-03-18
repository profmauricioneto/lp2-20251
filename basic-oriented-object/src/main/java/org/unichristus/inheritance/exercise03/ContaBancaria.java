package org.unichristus.inheritance.exercise03;

public class ContaBancaria {
    private String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            saldo -= valor;
        } else {
            System.err.println("Valor insuficiente");
        }
    }

    public Double getSaldo() {
        return saldo;
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual é R$: " + this.saldo);
    }
}
