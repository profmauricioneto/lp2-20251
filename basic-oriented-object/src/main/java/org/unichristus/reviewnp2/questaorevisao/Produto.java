package org.unichristus.reviewnp2.questaorevisao;

public abstract class Produto {
    protected String nome;
    protected double preco;
    protected String categoria;
    protected Pedido pedido;

    public Produto() {
        this.nome = "Indefinido";
         this.preco = 0;
         this.categoria = "Indefinido";
    }

    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public abstract void getInformation();


}
