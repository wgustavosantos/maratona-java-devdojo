package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1998, Month.FEBRUARY, 04, 0, 0);
        //Quantidade de dias desse nascimento ate agora

        System.out.println(ChronoUnit.DAYS.between(aniversario, LocalDateTime.now()));
        System.out.println(ChronoUnit.YEARS.between(aniversario, LocalDateTime.now()));
        System.out.println(ChronoUnit.WEEKS.between(aniversario, LocalDateTime.now()));
        System.out.println(ChronoUnit.DAYS.between(aniversario, LocalDateTime.now()));
    }
}
