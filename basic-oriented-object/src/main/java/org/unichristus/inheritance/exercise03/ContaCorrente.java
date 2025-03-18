package org.unichristus.inheritance.exercise03;


public class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= (getSaldo() + limite)) {
            this.saldo -= valor;
        } else {
            System.err.println("Valor insuficiente de saldo e limite de saldo");
        }
    }
}
