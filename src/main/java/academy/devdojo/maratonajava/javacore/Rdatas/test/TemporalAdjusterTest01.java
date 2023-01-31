package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.*;

class ObterProximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {

        //captura o dia da semana atual com o método .of *DayOfWeek é um tipo enum
        // utilizando switch expression
        return temporal.plus(switch (DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK))){
            case THURSDAY -> 4;
            case FRIDAY -> 3;
            case SATURDAY -> 2;
            default -> 1;
        }, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {

       LocalDate hoje = LocalDate.now();

       hoje = (LocalDate) new ObterProximoDiaUtil().adjustInto(hoje.withDayOfMonth(15));
        System.out.println(hoje);
    }
}
