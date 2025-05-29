package org.unichristus.templatemethod.compilador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String tipoCompilador;
        Compilador compilador;

        System.out.print("Digite ios ou android: ");
        tipoCompilador = scan.next();

        if (tipoCompilador.equalsIgnoreCase("ios")) {
            compilador = new IOSCompilador();
        } else if (tipoCompilador.equalsIgnoreCase("android")) {
            compilador = new AndroidCompilador();
        } else if (tipoCompilador.equalsIgnoreCase("windows")) {
            compilador = new WindowsPhone();
        } else {
            System.err.println("Compilador não existente!");
        }
    }
}
