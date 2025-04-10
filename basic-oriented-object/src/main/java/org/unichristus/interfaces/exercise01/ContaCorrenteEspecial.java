package org.unichristus.interfaces.exercise01;

public class ContaCorrenteEspecial extends ContaCorrente {
    public ContaCorrenteEspecial(String nome, String id) {
        super(id, nome);
    }
    public ContaCorrenteEspecial(double saldoInicial, String id, String nome) {
        super(saldoInicial, nome, id);
    }

    @Override
    public void sacar(double valorSaque) {
        if (this.saldo >= (valorSaque + 0.01*valorSaque)) {
            this.saldo -= (valorSaque + 0.01*valorSaque);
        } else {
            System.err.println("Saldo insuficiente para a operação.");
        }
    }
}
