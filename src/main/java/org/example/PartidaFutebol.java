package org.example;

import java.util.Date;

class PartidaFutebol extends Partida {
    private int substituicoesTime1;
    private int substituicoesTime2;
    private final int MAX_SUBSTITUICOES = 3;

    public PartidaFutebol(String time1, String time2, Date data) {
        super(time1, time2, data);
        this.substituicoesTime1 = 0;
        this.substituicoesTime2 = 0;
    }

    public void fazerSubstituicao(String time) throws Exception {
        if (time.equals(timeOuJogador1)) {
            if (substituicoesTime1 < MAX_SUBSTITUICOES) {
                substituicoesTime1++;
            } else {
                throw new Exception("Time " + timeOuJogador1 + " atingiu o limite de substituições.");
            }
        } else if (time.equals(timeOuJogador2)) {
            if (substituicoesTime2 < MAX_SUBSTITUICOES) {
                substituicoesTime2++;
            } else {
                throw new Exception("Time " + timeOuJogador2 + " atingiu o limite de substituições.");
            }
        }
    }

    @Override
    public void registrarResultado(int golsTime1, int golsTime2) {
        this.resultado = new int[]{golsTime1, golsTime2};
    }

    @Override
    public int[] calcularPontos() {
        if (resultado[0] > resultado[1]) {
            return new int[]{3, 0};  // Time 1 vence
        } else if (resultado[0] < resultado[1]) {
            return new int[]{0, 3};  // Time 2 vence
        } else {
            return new int[]{1, 1};  // Empate
        }
    }
}

