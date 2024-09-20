package org.example;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {

        // Exemplo de Partida de Futebol
        PartidaFutebol partidaFutebol = new PartidaFutebol("Time A", "Time B", new Date());
        partidaFutebol.fazerSubstituicao("Time A");
        partidaFutebol.fazerSubstituicao("Time B");
        partidaFutebol.registrarResultado(2, 1);
        int[] pontosFutebol = partidaFutebol.calcularPontos();
        System.out.println("Pontos Futebol: Time A - " + pontosFutebol[0] + ", Time B - " + pontosFutebol[1]);

        System.out.println("-----------------------------------------------------------------------------------");

        // Exemplo de Partida de Basquete
        PartidaBasquete partidaBasquete = new PartidaBasquete("Time C", "Time D", new Date());
        partidaBasquete.registrarResultado(100, 90);
        int[] pontosBasquete = partidaBasquete.calcularPontos();
        System.out.println("Pontos Basquete: Time C - " + pontosBasquete[0] + ", Time D - " + pontosBasquete[1]);

        System.out.println("-----------------------------------------------------------------------------------");

        // Exemplo de Partida de Tênis
        PartidaTenis partidaTenis = new PartidaTenis("Jogador 1", "Jogador 2", new Date());
        partidaTenis.registrarResultado(3, 2);
        int[] pontosTenis = partidaTenis.calcularPontos();
        System.out.println("Pontos Tênis: Jogador 1 - " + pontosTenis[0] + ", Jogador 2 - " + pontosTenis[1]);

    }
}
