package org.unichristus.interfaces.exercise01;

public class ContaCorrente implements OperacoesBancarias, OperacoesPessoais {
    protected double saldo;
    protected String nome;
    protected String id;

    public ContaCorrente(String id, String nome) {
        this.id = id;
        this.saldo = 0;
        this.nome = nome;
    }
    public ContaCorrente(double saldo, String nome, String id) {
        this.saldo = saldo;
        this.nome = nome;
        this.id = id;
    }

    @Override
    public void depositar(double valorDepositado) {
        this.saldo += valorDepositado;
    }
    @Override
    public void sacar(double valorSaque) {
        if (this.saldo >= (valorSaque + 0.05*valorSaque)) {
            this.saldo -= (valorSaque + 0.05*valorSaque);
        } else {
            System.err.println("Saldo insuficiente para a operação.");
        }
    }

    @Override
    public double recuperarSaldo() {
        return this.saldo;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
