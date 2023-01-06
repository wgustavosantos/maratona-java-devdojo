package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault()); //Como a JVM está localizada
        for (String country: Locale.getISOCountries()) {
            System.out.println(country);
        }
        for (String lenguage: Locale.getISOLanguages()) {
            System.out.println(lenguage);
        }

    }
}
