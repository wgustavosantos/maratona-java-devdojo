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

        final List<String> collect = stream.sorted((ln1, ln2) -> ln1.getTitle().compareTo(ln2.getTitle()))
                .filter(ln -> ln.getPrice() <= 4.0) //retornam todos elementos que forem true
                .limit(3)
                .map(ln -> ln.getTitle())
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
