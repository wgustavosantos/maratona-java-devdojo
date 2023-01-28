package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {

    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {

        final Stream<LightNovel> stream = list.stream();

        /* É um stream com operação terminal/final*/
//        list.stream().forEach(System.out::println);

        /* Não é um stream, apenas um método de Iterable */
//        list.forEach(System.out::println);
//
        final long count = stream
                .distinct() //retorna stream de elementos únicos
                .filter(ln -> ln.getPrice() <= 4.0) //filtra por um predicate e retorna elementos true
                .count();//retorna em long o numero de ocorrencias

        System.out.println("Quantidade de mangás com preço menor que 4 dinheiros: " + count);

    }
}
