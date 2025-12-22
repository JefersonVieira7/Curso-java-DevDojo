package academy.devdojo.maratonajava.javacore.ZZEstream.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


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
        List<String> palavras = Arrays.asList("java", "python", "java", "c++", "java", "ruby");
        List<String> listaUnica = palavras.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Lista sem duplicatas: "+listaUnica);

    }
}
