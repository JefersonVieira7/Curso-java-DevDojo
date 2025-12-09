package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {

        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5L, "Dragon Ball", 100));
        mangas.add(new Manga(3L, "Cavaleiros do Zodíaco", 90));
        mangas.add(new Manga(1L, "Yuyu Hakusho", 80));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
