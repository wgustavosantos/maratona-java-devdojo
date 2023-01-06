package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste01 {
    public static void main(String[] args) {
        Locale locale = new Locale("pt", "BR");

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);

        System.out.println(df.format(Calendar.getInstance().getTime()));
    }
}
