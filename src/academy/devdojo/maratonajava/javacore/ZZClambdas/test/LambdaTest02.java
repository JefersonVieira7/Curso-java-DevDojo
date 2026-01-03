package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> names = List.of("Jeferson", "jefinho");

        List<Integer> inteiros = map(names, name -> name.length());
        List<String> toUpperCase = map(names, name -> name.toUpperCase());
        System.out.println(inteiros);
        System.out.println(toUpperCase);

    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for (T element : list){
            R r = function.apply(element);
            result.add(r);
        }
        return result;
    }
}
