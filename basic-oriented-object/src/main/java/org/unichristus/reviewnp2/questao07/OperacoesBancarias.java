package org.unichristus.reviewnp2.questao07;

public interface OperacoesBancarias {
    public void sacar(double valorSacado);
    public void depositar(double valorDepositado);
    public double consultarSaldo();
}
