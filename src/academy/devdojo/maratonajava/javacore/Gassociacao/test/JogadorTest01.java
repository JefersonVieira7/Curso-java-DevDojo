package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cristiano Ronaldo");
        Jogador jogador2 = new Jogador("Sadio Mané");
        Jogador[] jogadores = {jogador1, jogador2};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}