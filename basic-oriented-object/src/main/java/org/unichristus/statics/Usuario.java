package org.unichristus.statics;

public class Usuario {
    private static int id = 0;
    private int idUsuario;
    private String name;

    public Usuario (String name) {
        this.name = name;
        idUsuario = incrementarId();
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    private static int incrementarId() {
        return ++id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
