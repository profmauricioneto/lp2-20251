package org.unichristus.reviewnp2.questaorevisao;

public class ProdutoFisico extends Produto {
    private int peso;

    public ProdutoFisico(int peso) {
        super();
        this.peso = peso;
    }
    public ProdutoFisico(int peso, String nome, double preco, String categoria) {
        super(nome, preco, categoria);
        this.peso = peso;
    }

    public double calcularEnvioProduto() {
        return peso*3;
    }

    public void getInformation() {
        System.out.println(calcularEnvioProduto());
    }
}
