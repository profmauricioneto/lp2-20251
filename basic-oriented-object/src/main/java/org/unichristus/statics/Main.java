package org.unichristus.statics;

public class Main {
    public static void main(String[] args) {
        Usuario mauricio = new Usuario("Mauricio");
        System.out.println("Usuario: " + mauricio.getName() + " ID: " + mauricio.getIdUsuario());

        Usuario joeliton = new Usuario("Joeliton");
        System.out.println("Usuario: " + joeliton.getName() + " ID: " + joeliton.getIdUsuario());

        Usuario lucas = new Usuario("Lucas");
        System.out.println("Usuario: " + lucas.getName() + " ID: " + lucas.getIdUsuario());

    }
}

