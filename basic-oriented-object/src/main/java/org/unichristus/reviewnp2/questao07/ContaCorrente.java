package org.unichristus.reviewnp2.questao07;

public class ContaCorrente implements OperacoesBancarias {
    protected double saldo;

    public ContaCorrente() {
        this.saldo = 0;
    }

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public void sacar(double valorSacado) {
        if (valorSacado >= (saldo + 0.05*valorSacado)) {
            this.saldo -= valorSacado;
        } else {
            System.err.println("Saldo Insuficiente");
        }
    }

    @Override
    public void depositar(double valorDepositado) {
        this.saldo += valorDepositado;
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }
}
