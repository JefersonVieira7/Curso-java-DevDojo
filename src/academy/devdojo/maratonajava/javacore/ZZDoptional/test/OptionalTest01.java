package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> nameOptional = findName("William");
        String empty = nameOptional.orElse("EMPTY");
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
        System.out.println(empty);
    }

    private static Optional<String> findName(String name){
        List<String> list = List.of("William", "DevDojo");
        int i = list.indexOf(name);
        if (i >= 0){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
