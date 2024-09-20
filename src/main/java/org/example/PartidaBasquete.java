package org.example;

import java.util.Date;

class PartidaBasquete extends Partida {

    public PartidaBasquete(String time1, String time2, Date data) {
        super(time1, time2, data);
    }

    @Override
    public void registrarResultado(int pontosTime1, int pontosTime2) {
        this.resultado = new int[]{pontosTime1, pontosTime2};
    }

    @Override
    public int[] calcularPontos() {
        if (resultado[0] > resultado[1]) {
            return new int[]{2, 0};  // Time 1 vence
        } else if (resultado[0] < resultado[1]) {
            return new int[]{0, 2};  // Time 2 vence
        } else {
            return new int[]{0, 0};  // Empate (não ocorre em basquete)
        }
    }
}

