package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {

        // \d contrabarra d recupera todos os digitos
        // \D contrabarra D recupera tudo o que nao for digito
        // \s contrabarra s recupera todos os espaços em branco \t \s \f \r
        // \S contrabarra S recupera tudo sem espaço em branco \t \s \f \r
        // \w contrabarra w recupera tudo de a-A-z-Z, dígitos tirando especiais
        // \W contrabarra W recupera tudo que não está incluso em \w
        // [] range de caracteres
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
        String texto7 = "@hj75 ac\t8EeA9 0x21BD7 0Xk3 0x23AB";
        String regex7 = "\\w";
        String regex8 = "[a-zA-C]";
        String regex9NumHex = "0[xX]([0-9A-Fa-f])+(\\s|$)";

        Pattern pattern = Pattern.compile(regex9NumHex);
        Matcher matcher = pattern.matcher(texto7);

        System.out.println("texto: " + texto7);
        System.out.println("indice 0123456789");

        System.out.println("regex " + regex8);
        System.out.println("posicoes encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

        int numeroHex = 0x123AAF;
        System.out.println(numeroHex);

    }
}
