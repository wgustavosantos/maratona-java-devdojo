package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2023, Month.JANUARY, 8);
        System.out.println(localDate);
        System.out.println(LocalDate.now());
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.withYear(2022));
    }
}
