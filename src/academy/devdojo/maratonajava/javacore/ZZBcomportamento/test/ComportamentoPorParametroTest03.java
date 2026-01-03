package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03{

    private static List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019)
    );

    public static void main(String[] args) {

        System.out.println(filter(cars, car -> car.getColor().equalsIgnoreCase("green")));
        System.out.println(filter(nums, n -> n % 2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        return list.stream()
                .filter(predicate)
                .toList();
    }
}
