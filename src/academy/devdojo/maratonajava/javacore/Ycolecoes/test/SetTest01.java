package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Dragon Ball", 100, 0));
        mangas.add(new Manga(3L, "Cavaleiros do Zodíaco", 90, 1));
        mangas.add(new Manga(1L, "Yuyu Hakusho", 80, 0));




        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }
}
