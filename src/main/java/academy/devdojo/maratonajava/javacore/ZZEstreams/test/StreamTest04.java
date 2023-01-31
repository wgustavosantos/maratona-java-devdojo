package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();

        List<String> graphicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("William", "David", "Harisson");
        List<String> students = List.of("Édipo", "Gustavo Lima", "Gustavo Mendes", "Guilherme");

        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        /* Como imprimir os elementos de uma lista de listas
        * não utilizando a api stream j8*/

        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }


        /*Imprimir os elementos de uma lista de listas
        * utilizando a api java 8
        * utilizando o flatMapt*/
        System.out.println("\n****utilizando flatmap****");
        devdojo.
                stream().
                flatMap(Collection::stream).
                forEach(System.out::println);
    }
}