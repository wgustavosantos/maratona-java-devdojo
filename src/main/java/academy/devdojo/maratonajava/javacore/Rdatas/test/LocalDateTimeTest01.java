package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime padrão " + localDateTime);

        LocalDate localDate = LocalDate.parse("2022-08-06");
        LocalTime localTime = LocalTime.parse("13:25:56");

        System.out.println("LocalDate.parse " + localDate);
        System.out.println("LocalTime.parse " + localTime);

        LocalDateTime localDateTime1 = localDate.atTime(localTime);
        System.out.println("LocalDateTime com localDate.atTime " + localDateTime1);

        LocalDateTime localDateTime2 = localTime.atDate(localDate);
        System.out.println("LocalDateTime com localTime.atDate " + localDateTime2 );
    }
}
