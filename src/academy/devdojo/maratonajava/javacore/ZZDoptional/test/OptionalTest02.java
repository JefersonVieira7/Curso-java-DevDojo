package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.test.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByName("Boku no Hero");
        mangaByTitle.ifPresent(manga -> manga.setTitle(("Bokinho no Hero")));
        System.out.println(mangaByTitle);

        Manga mangabyId = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);

        System.out.println(mangabyId);

        Manga newManga = MangaRepository.findByName("Drifters")
                .orElse(new Manga(3, "Drifters", 70));

    }
}
