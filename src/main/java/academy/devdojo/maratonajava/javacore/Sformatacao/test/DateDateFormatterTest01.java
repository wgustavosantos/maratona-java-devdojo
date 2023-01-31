package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateDateFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        //sainda
        /*
        * 20230111
        2023-01-11
        2023-01-11
        * */

        //transformando String em um Objeto

        LocalDate parse1 = LocalDate.parse("20230111", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2023-01-11+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2023-01-11", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("parse1 " + parse1);
        System.out.println("parse2 " + parse1);
        System.out.println("parse3 " + parse1);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        //Data em String para LocalDateTime

        LocalDateTime now2 = LocalDateTime.parse("2023-01-11T15:48:45.7145609");
        System.out.println(now2);

        //Usando um formatador personalizado

        DateTimeFormatter formatterLocalDateBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataStringBr = LocalDate.now().format(formatterLocalDateBR);
        System.out.println("Mostrando uma String formatada no formato BR LocalDate " + dataStringBr);

        DateTimeFormatter formatterLocalDateTimeBR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataTimeStringBr = LocalDateTime.now().format(formatterLocalDateTimeBR);
        System.out.println("Mostrando uma String formatada no formato BR LocalDateTime " + dataTimeStringBr);
    }
}
