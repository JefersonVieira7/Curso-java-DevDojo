package academy.devdojo.maratonajava.javacore.Dconstrutores.Test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball Z", 12, "ação", "azul");
        anime.imprimi();
    }
}

