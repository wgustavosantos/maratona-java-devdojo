package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        localDate = localDate.plusDays(25);
        System.out.println("Virando uma data no campo dia passando um valor para o dia " + localDate);
        localDate = localDate.withDayOfMonth(25);
        System.out.println("Trocando o campo dia com withDayOfMonth passando um int para substituir o valor " + localDate );
        //ou
        localDate = localDate.with(ChronoField.DAY_OF_MONTH, 20);
        System.out.println("Trocando o campo dia  com with passando um ChronoField " + localDate);

        LocalDate now2 = LocalDate.now();

        now2 = now2.
    }
}
