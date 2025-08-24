package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.Teste;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.Dominio.Anime;

public class TestAnime01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto");
        for (int episodio: anime.getEpisodios()){
            System.out.print(episodio+ " ");
        }

    }
}
