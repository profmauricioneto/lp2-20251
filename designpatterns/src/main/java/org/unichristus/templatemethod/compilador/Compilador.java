package org.unichristus.templatemethod.compilador;

public abstract class Compilador {
    public Compilador() {
        this.codigoFonte();
        this.compilarParaBinario();
        this.executar();
    }
    public abstract void codigoFonte();
    public abstract void compilarParaBinario();
    public abstract void executar();
}
