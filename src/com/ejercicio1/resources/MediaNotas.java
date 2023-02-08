package com.ejercicio1.resources;
import java.util.List;

public class MediaNotas extends Thread {

    private int numHilo;
    private int idInicial;
    private int idFinal;
    private List<Integer> califications;

    private int sumaNotas;

    private int sumResult = 0;

    public MediaNotas(int numeroHilo, int indiceInicial, int indiceFinal, List<Integer> califications) {
        this.numHilo = numeroHilo;
        this.idInicial = indiceInicial;
        this.idFinal = indiceFinal;
        this.califications = califications;
    }

    public int getSumaNotas() {
        return sumaNotas;
    }

    public int getNumeroHilo() {
        return numHilo;
    }

    public int getIndiceInicial() {
        return idInicial;
    }

    public int getNotasSumadas() {
        return sumResult + 1;
    }

    @Override
    public void run() {
        for (int i = idInicial; i < idFinal; i++) {
            sumaNotas += califications.get(i);
            sumResult += 1;
        }
    }
}
