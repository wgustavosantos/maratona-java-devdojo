package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        if (c.getFirstDayOfWeek() != Calendar.SUNDAY){
            System.out.println("Hoje não é domingo");
        }
        System.out.println(c.DAY_OF_WEEK);
        System.out.println("Dia do mes' + " + c.DAY_OF_MONTH);
        System.out.println("Dia do ano" + c.YEAR);
        System.out.println(c.DAY_OF_WEEK_IN_MONTH);
    }
}
