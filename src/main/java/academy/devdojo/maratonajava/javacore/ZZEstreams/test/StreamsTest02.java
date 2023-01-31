package academy.devdojo.maratonajava.javacore.ZZEstreams.test;


import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//1 ordene todos os lightnovel por titulo
//2 retrieve
public class StreamsTest02 {

    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));


    public static void main(String[] args) {
        final Stream<LightNovel> stream = list.stream();

        final List<String> collect = stream.sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4.0) //retornam todos elementos que forem true
                .limit(3) //retorna os 3 primeiros da lista
                .map(LightNovel::getTitle) // percorre todos os elementos e retorna um tipo
                .collect(Collectors.toList());//converte para uma lista

        System.out.println(collect);
    }
}
