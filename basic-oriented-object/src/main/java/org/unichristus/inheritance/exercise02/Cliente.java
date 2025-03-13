package org.unichristus.inheritance.exercise02;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private String email;
    private List<Venda> compras;

    public Cliente(int codigo, String nome) {
        super(codigo);
        this.nome = nome;
        this.email = "Indefinido";
        this.compras = new ArrayList<Venda>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void addCompras(Venda venda) {
        this.compras.add(venda);
    }
}
