package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALIAN;
        Locale localeUSA = Locale.US;
        NumberFormat nb[] = new NumberFormat[4];
        nb[0] = NumberFormat.getCurrencyInstance(localePT);
        nb[1] = NumberFormat.getCurrencyInstance(localeJP);
        nb[2] = NumberFormat.getCurrencyInstance(localeIT);
        nb[3] = NumberFormat.getCurrencyInstance(localeUSA);
        for(NumberFormat nFormat : nb){
            System.out.println(nFormat.format(123450));
        }


    }
}
