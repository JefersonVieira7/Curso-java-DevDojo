package academy.devdojo.maratonajava.javacore.Ycolecoes.exerciciosIndividuais;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FiltraParesLista {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 10, 25, 30));
        List<Integer> paresOnly = new ArrayList<>();
        int contaPar = 0;
        for (Integer number : numbers) {

            if (number % 2 == 0){
                paresOnly.add(number);
                contaPar++;
            }
        }

        Collections.sort(paresOnly);
        System.out.println(paresOnly.toString());
        System.out.println(contaPar);
    }
}
