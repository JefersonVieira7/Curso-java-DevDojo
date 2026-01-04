package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> names = List.of("Jeferson", "jefinho");
        System.out.println("Tamanho da lista: "+ names.size());
        foreach(names, name -> System.out.println(name));
    }

    public static <T> void foreach(List<T> list, Consumer<T> consumer){
        for (T element : list) {
            consumer.accept(element);
        }
    }
}