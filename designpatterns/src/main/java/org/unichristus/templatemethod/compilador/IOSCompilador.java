package org.unichristus.templatemethod.compilador;

public class IOSCompilador extends Compilador {
    public IOSCompilador() {
        super();
    }

    public void codigoFonte() {
        System.out.println("Código Swift!");
    }
    public void compilarParaBinario() {
        System.out.println("Compilando para IOS");
    }
    public void executar() {
        System.out.println("Executando no Xcode!");
    }
}
