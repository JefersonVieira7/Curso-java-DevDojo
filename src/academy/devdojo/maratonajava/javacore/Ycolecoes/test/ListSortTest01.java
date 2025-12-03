package academy.devdojo.maratonajava.javacore.Ycolecoes.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> animes = new ArrayList<>(3);
        animes.add("Dragon Ball");
        animes.add("Cavaleiros do Zodíaco");
        animes.add("Yuyu Hakusho");

        Collections.sort(animes);

        for (String anime : animes){
            System.out.println(anime);
        }
    }
}
