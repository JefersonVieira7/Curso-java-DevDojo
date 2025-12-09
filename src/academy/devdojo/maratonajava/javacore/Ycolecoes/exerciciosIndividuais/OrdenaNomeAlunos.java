package academy.devdojo.maratonajava.javacore.Ycolecoes.exerciciosIndividuais;

import java.util.*;

public class OrdenaNomeAlunos {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Lucas", "Ana", "Carlos", "Bianca", "Zé", "Eren", "Mikasa", "Lucas"));
        List<String> listaSemDuplicados = new ArrayList<>();

        //System.out.println(set);

        for (String name : names) {
            if (!listaSemDuplicados.contains(name)){
                listaSemDuplicados.add(name);
            }
        }

        Collections.sort(listaSemDuplicados);
        System.out.println(listaSemDuplicados.toString());

        Collections.sort(names);
        for (String name : names) {
            System.out.println(name);
        }

//        for (int i = 0; i < names.size(); i--) {
//            int count = 0;
//            if (names.indexOf()){
//
//            }
//        }


    }
}
