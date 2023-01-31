package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALIAN;

        NumberFormat nb[] = new NumberFormat[3];

        nb[0] = NumberFormat.getInstance(localePT);
        nb[1] = NumberFormat.getInstance(localeJP);
        nb[2] = NumberFormat.getInstance(localeIT);

        double valor = 10_000.2130;

        for(NumberFormat nFormat : nb){

            System.out.println(nFormat.format(valor));
        }


    }
}
