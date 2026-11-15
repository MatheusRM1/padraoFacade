package org.facade;

public class Multas extends Setor {

    private static Multas multas = new Multas();

    private Multas() {};

    public static Multas getInstancia() {
        return multas;
    }
}