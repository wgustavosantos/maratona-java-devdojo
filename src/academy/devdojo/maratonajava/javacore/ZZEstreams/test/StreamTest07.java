package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest07 {

    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)));

    public static void main(String[] args) {

        final List<Integer> integers = List.of(1, 2, 3);


        final Integer reduce = integers.stream().reduce(0, (x, y) -> x+y);
        final Integer reduce2 = integers.stream().reduce(0, Integer::sum);
        System.out.println("Mostrando soma de lista de inteiros: " + reduce + " " + reduce2);

        integers.stream().reduce( (x, y) -> x+y).ifPresent(System.out::println);
        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);

        System.out.println("Pegando o maior valor em uma lista de String");
        integers.stream().reduce(Integer::max).ifPresent(System.out::println);
        integers.stream().reduce((x, y)-> x > y ? x : y).ifPresent(System.out::println);




    }
}
