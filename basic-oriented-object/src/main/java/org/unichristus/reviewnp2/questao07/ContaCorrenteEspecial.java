package org.unichristus.reviewnp2.questao07;

public class ContaCorrenteEspecial extends ContaCorrente {
    public ContaCorrenteEspecial() {
        super();
    }

    public ContaCorrenteEspecial(double saldo) {
        super(saldo);
    }

    @Override
    public void sacar(double valorSacado) {
        if (valorSacado >= (saldo + 0.01*valorSacado)) {
            this.saldo -= valorSacado;
        } else {
            System.err.println("Saldo Insuficiente");
        }
    }
}
