package org.unichristus;

public class Janela {

    public Retangulo retangulo;

    public Janela(double largura, double altura) {
        this.retangulo =  new Retangulo(largura, altura);
    }

    public void showAreaJanela() {
        System.out.println("Area da Janela: " + retangulo.calcularArea());
    }

    public void showPerimetroJanela() {
        System.out.println("Area da Perimetro: " + retangulo.calcularPerimetro());
    }

    public static void main(String[] args) {
        Janela janela = new Janela(300, 300);
        janela.showAreaJanela();
        janela.showPerimetroJanela();
    }
}
