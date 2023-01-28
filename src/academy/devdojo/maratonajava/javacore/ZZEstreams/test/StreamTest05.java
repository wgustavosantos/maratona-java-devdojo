package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* Retorna cada letra em uma lista */
public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        //regex com aspas vazias separa letra por letra
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        /*Retorna uma lista de array de string*/
        final List<String[]> collect = words.
                stream().
                map(w -> w.split("")).
                collect(Collectors.toList());

        /*Transformar um array de String para um stream*/
        final Stream<String> stream = Arrays.stream(letters);

        final List<String> collect1 = words.stream()
                .map(w -> w.split(""))//retorna UM STREAM DE ARRAY DE STRING
                .flatMap(l -> Arrays.stream(l)) //stream de String
                .collect(Collectors.toList());

        System.out.println(collect1);
    }
}
