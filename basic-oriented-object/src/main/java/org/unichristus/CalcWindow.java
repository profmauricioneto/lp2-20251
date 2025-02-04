package org.unichristus;

import java.util.Scanner;

public class CalcWindow {
    public static void main(String[] args) {
        double largura, altura, area, perimetro;
        Scanner scan = new Scanner(System.in);
        // entrada
        System.out.print("Altura: ");
        altura = scan.nextDouble();
        System.out.print("Largura: ");
        largura = scan.nextDouble();
        // processamento
        area = largura * altura;
        perimetro = 2*largura + 2*altura;
        // saída
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
