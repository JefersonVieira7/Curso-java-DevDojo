package academy.devdojo.maratonajava.javacore.ZZEstream.dominio.test;


import academy.devdojo.maratonajava.javacore.ZZEstream.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogarari", 4.00)
    ));

    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel ::getTitle).reversed());
        List<String> novelsMaisBaratos = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4){
                novelsMaisBaratos.add(lightNovel.getTitle());
            }
            if (novelsMaisBaratos.size() >=3){
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println(novelsMaisBaratos);
    }
}
