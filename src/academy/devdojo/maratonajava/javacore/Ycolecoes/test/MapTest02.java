package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.*;

public class MapTest02 {
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
        for (Consumidor consumidor : consumidores){
            System.out.println(consumidor);
        }

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga3);
        consumidorManga.put(consumidor3, manga2);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey() + " - "+ entry.getValue());
        }
    }
}
