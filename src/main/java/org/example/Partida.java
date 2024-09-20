package org.example;
import java.util.Date;
abstract class Partida {
    protected String timeOuJogador1;
    protected String timeOuJogador2;
    protected Date data;
    protected int[] resultado;

    public Partida(String timeOuJogador1, String timeOuJogador2, Date data) {
        this.timeOuJogador1 = timeOuJogador1;
        this.timeOuJogador2 = timeOuJogador2;
        this.data = data;
    }

    public abstract void registrarResultado(int resultado1, int resultado2);
    public abstract int[] calcularPontos();
}

