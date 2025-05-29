package org.unichristus.templatemethod.compilador;

public class AndroidCompilador extends Compilador {
    public AndroidCompilador() {
        super();
    }

    public void codigoFonte() {
        System.out.println("Código Kotlin!");
    }
    public void compilarParaBinario() {
        System.out.println("Compilando para JVM");
    }
    public void executar() {
        System.out.println("Executando no Android Studio!");
    }
}
