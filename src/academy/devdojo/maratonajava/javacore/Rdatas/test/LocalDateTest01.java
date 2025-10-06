package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, Month.JANUARY, 28);
        LocalDate date2 = LocalDate.of(2025, Month.FEBRUARY, 28);
        LocalDate now = LocalDate.now();
        System.out.println(date);
        System.out.print(date.getDayOfMonth()+" ");
        System.out.print(date.getMonth()+" ");
        System.out.println(date.getYear());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.lengthOfMonth());
        System.out.println(date2.lengthOfMonth());
        System.out.println(now);

    }
}
