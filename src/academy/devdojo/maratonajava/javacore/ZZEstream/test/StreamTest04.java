package academy.devdojo.maratonajava.javacore.ZZEstream.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphcsDesigners = List.of("Willian Suane", "Jeferson Vieira","Sandy carolina");
        List<String> developers = List.of("Jefinho", "devdojo");
        List<String> students = List.of("èdipp", "Gustavo Lima", "Gustavo Mendes");
        devdojo.add(graphcsDesigners);
        devdojo.add(developers);
        devdojo.add(students );


        devdojo.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
