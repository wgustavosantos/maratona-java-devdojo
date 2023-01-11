package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {

        // \d contrabarra d recupera todos os digitos
        // \D contrabarra D recupera tudo o que nao for digito
        // \s contrabarra s recupera todos os espaços em branco \t \s \f \r
        // \S contrabarra S recupera tudo sem espaço em branco \t \s \f \r
        // \w contrabarra w recupera tudo de a-A-z-Z, dígitos tirando especiais

        String regex = "aba";
        String texto = "abababa";
        String texto2 = "hj75jkjk89";
        String regex2 = "\\d";
        String texto3 = "@hj75jkjk89";
        String regex3 = "\\D";
        String texto4 = "@hj75 jkjk\t89";
        String regex4 = "\\s";
        String texto5 = "@hj75 jkjk\t89";
        String regex5 = "\\S";
        String texto6 = "@hj75 jkjk\t89";
        String regex6 = "\\w";
        String texto7 = "@hj75 jkjk\t89";
        String regex7 = "\\W";


        Pattern pattern = Pattern.compile(regex7);
        Matcher matcher = pattern.matcher(texto7);

        System.out.println("texto: " + texto7);
        System.out.println("indice 0123456789");

        System.out.println("regex " + regex7);
        System.out.println("posicoes encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

    }
}
