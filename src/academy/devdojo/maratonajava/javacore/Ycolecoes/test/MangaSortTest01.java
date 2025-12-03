package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(3);


        mangas.add(new Manga(5L, "Dragon Ball", 100));
        mangas.add(new Manga(3L, "Cavaleiros do Zodíaco", 90));
        mangas.add(new Manga(1L, "Yuyu Hakusho", 80));

        Collections.sort(mangas);
        System.out.println("--------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
