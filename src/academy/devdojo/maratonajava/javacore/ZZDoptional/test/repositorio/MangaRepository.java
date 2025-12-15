package academy.devdojo.maratonajava.javacore.ZZDoptional.test.repositorio;

import academy.devdojo.maratonajava.javacore.ZZDoptional.test.Manga;

import java.util.List;
import java.util.Optional;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "Boku no Hero", 50), new Manga(2, "OverLord", 25));

    public static Optional<Manga> findById(Integer id){
        Manga found = null;
        for (Manga manga : mangas){
            if (manga.getId().equals(id)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }

    public static Optional<Manga> findByName(String title){
        Manga found = null;
        for (Manga manga : mangas){
            if (manga.getTitle().equals(title)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}
