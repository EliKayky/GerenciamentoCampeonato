package org.example;

import java.util.Date;

class PartidaTenis extends Partida {

    public PartidaTenis(String jogador1, String jogador2, Date data) {
        super(jogador1, jogador2, data);
    }

    @Override
    public void registrarResultado(int setsJogador1, int setsJogador2) {
        this.resultado = new int[]{setsJogador1, setsJogador2};
    }

    @Override
    public int[] calcularPontos() {
        if (resultado[0] > resultado[1]) {
            return new int[]{1, 0};  // Jogador 1 vence
        } else {
            return new int[]{0, 1};  // Jogador 2 vence
        }
    }
}

