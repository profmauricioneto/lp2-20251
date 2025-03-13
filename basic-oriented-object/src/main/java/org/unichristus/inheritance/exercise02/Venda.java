package org.unichristus.inheritance.exercise02;

import java.util.Date;

public class Venda {
    private long codigoVenda;
    public Date dataVenda;
    private Cliente cliente;
    private Funcionario funcionario;

    public Venda( Cliente cliente, Funcionario funcionario) {
        this.codigoVenda = geradorDeCodigo();
        this.cliente = cliente;
        this.funcionario = funcionario;
        dataVenda = new Date();
    }

    public long getCodigoVenda() {
        return codigoVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public long geradorDeCodigo() {
        return Math.round(Math.random()*100);
    }


}
