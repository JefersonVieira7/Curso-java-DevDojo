package academy.devdojo.maratonajava.javacore.ZZEstream.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TestAleatory01 {
    public static List<String> nomes = new ArrayList<>(List.of(
            "Abacaxi", "Banana", "Laranja", "Maçã"
    ));
    public static  List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);

    public static List<Pessoa> pessoas = new ArrayList<>(List.of(
            new Pessoa("Jeferson", 19),
            new Pessoa("Estefany", 20),
            new Pessoa("Raiana", 22),
            new Pessoa("Raissa" , 13),
            new Pessoa("Joelson junior" , 12)
    ));

    public static void main(String[] args) {
        System.out.println("Pessoas com idade menor ou igual a 18 anos:");
        pessoas.stream()
                .filter(pessoa -> pessoa.getIdade() <= 18)
                .sorted(Comparator.comparing(Pessoa::getIdade))
                .forEach(pessoa -> System.out.println(pessoa.getName()));
    }
}
