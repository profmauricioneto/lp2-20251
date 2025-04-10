package org.unichristus.interfaces.exercise01;

import java.util.UUID;

public class Banco {
    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString();
        ContaCorrente contaMauricio = new ContaCorrente(1, "Mauricio", uuid);
        contaMauricio.depositar(200);
        System.out.println(contaMauricio.getId());
        System.out.println(contaMauricio.recuperarSaldo());

        contaMauricio.sacar(100);
        System.out.println(contaMauricio.recuperarSaldo());
//        contaMauricio.sacar(595);
//        System.out.println(contaMauricio.recuperarSaldo());

        String uuid2 = UUID.randomUUID().toString();
        contaMauricio = new ContaCorrenteEspecial(700, uuid2, "Mauricio");
        System.out.println(contaMauricio.getId());
        System.out.println(contaMauricio.recuperarSaldo());

        contaMauricio.sacar(100);
        System.out.println(contaMauricio.recuperarSaldo());
    }
}
