package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019)
    );
    public static void main(String[] args) {
        System.out.println(cars);
        System.out.println(filterByColor(cars, "black", 2000));
    }

    private static List<Car> filterByColor(List<Car> cars, String color, int year) {
        return cars.stream()
                .filter(car -> car.getColor().equalsIgnoreCase(color) && car.getYear() < year)
                .toList();
    }
}
