package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Dragon Ball", 100, 0));
        mangas.add(new Manga(3L, "Cavaleiros do Zodíaco", 90, 1));
        mangas.add(new Manga(1L, "Yuyu Hakusho", 80, 0));

        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()){
            Manga manga = mangaIterator.next();
            if (manga.getQuantidade() == 0){
                mangaIterator.remove();
            }
        }
        System.out.println(mangas);
        mangas.removeIf(manga -> manga.getQuantidade() == 0);

    }
}
