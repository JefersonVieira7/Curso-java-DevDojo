package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        Duration duration = Duration.between(now, nowAfterTwoYears);
        System.out.println(duration);
    }
}
