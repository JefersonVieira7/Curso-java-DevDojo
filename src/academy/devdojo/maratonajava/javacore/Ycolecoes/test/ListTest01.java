package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Jeferson");
        nomes.add("Jefinho");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i).replace("J", "G"));
        }

        System.out.println("-------------");

        for (String nome : nomes){
            System.out.println(nome);
        }
    }
}
