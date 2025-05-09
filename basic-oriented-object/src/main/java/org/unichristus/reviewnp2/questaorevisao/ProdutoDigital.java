package org.unichristus.reviewnp2.questaorevisao;

import java.util.UUID;

public class ProdutoDigital extends Produto {
    private String codigoAtivacao;
    private UUID uuid = UUID.randomUUID();

    public ProdutoDigital() {
        super();
        this.codigoAtivacao = uuid.toString();
    }
    public ProdutoDigital(String nome, double preco, String categoria) {
        super(nome, preco, categoria);
        this.codigoAtivacao = uuid.toString();
    }

    public String gerarAtivacao() {
        return codigoAtivacao;
    }

    public void getInformation() {
        System.out.println(gerarAtivacao());
    }
}
