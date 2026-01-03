package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019)
    );

    public static void main(String[] args) {
        System.out.println(filter(cars, car -> car.getColor().equals("green")));
        System.out.println(filter(cars, car -> car.getColor().equals("red")));
        System.out.println(filter(cars, car -> car.getColor().equals("black")));
    }

    private static List<Car> filter(List<Car> cars, Predicate<Car> carPredicate){
        return cars.stream()
                .filter(car -> carPredicate.test(car))
                .toList();
    }
}
