package org.unichristus;

public class Retangulo {
    public double largura;
    public double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return (2*largura + 2*altura);
    }
}
