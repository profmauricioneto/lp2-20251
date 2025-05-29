package org.unichristus.templatemethod.compilador;

public class WindowsPhone extends Compilador {
    public WindowsPhone() {
        super();
    }

    public void codigoFonte() {
        System.out.println("Código Windows!");
    }
    public void compilarParaBinario() {
        System.out.println("Compilando para Alguma Coisa");
    }
    public void executar() {
        System.out.println("Executando no Windows!");
    }
}
