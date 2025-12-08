package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.*;

public class MapTest03 {
    public static void main(String[] args) {
        HashSet<Consumidor> consumidores = new HashSet<>();
        Consumidor consumidor1 = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("Jeferson");
        Consumidor consumidor3 = new Consumidor("Indiano");

        HashSet<Manga> mangas = new HashSet<>();

        Manga manga1 = new Manga(5L, "Dragon Ball", 100, 0);
        Manga manga2 = new Manga(3L, "Cavaleiros do Zodíaco", 90, 1);
        Manga manga3 = new Manga(1L, "Yuyu Hakusho", 80, 0);



        mangas.add(manga1);
        mangas.add(manga2);
        mangas.add(manga3);

        consumidores.add(consumidor1);
        consumidores.add(consumidor2);
        consumidores.add(consumidor3);


        List<Manga> mangas1 = List.of(manga1, manga2);
        List<Manga> mangas2 = List.of(manga3, manga2);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangas1);
        consumidorMangaMap.put(consumidor3, mangas2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }

        }
    }
}
