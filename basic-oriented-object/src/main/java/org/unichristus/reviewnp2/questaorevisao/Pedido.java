package org.unichristus.reviewnp2.questaorevisao;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    public double precoTotal;
    public List<Produto> produtos;

    public Pedido() {
        this.produtos = new ArrayList<>();
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void removeProduto(Produto produto) {
        this.produtos.remove(produto);
    }

    public double calcularPrecoTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public void imprimirInformacoesProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto.getNome());
            System.out.println(produto.getPreco());
        }
    }

    public void verificarEnvio(Produto produto) {
        produto.getInformation();
    }

}
