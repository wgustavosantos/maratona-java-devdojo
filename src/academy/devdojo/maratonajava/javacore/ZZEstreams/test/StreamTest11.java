package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 10.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)));
    public static void main(String[] args) {
        /*Sumarização - contagem de elementos*/
        final Long contagem1 = list.stream().collect(Collectors.counting());
        final long contagem2 = list.stream().count();
        final long contagem3 = list.size();

       //o maior em relação a duas comparações sem collectors
       list.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);

        //o maior em relação a duas comparações com collectors
       list.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);
       list.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);

       //soma de elementos (tipo primitivo)
        final double sum = list.stream().mapToDouble(LightNovel::getPrice).sum();
        final Double collect = list.stream().collect(Collectors.summingDouble(LightNovel::getPrice));

        /*Estatisticas com collectors   */
        final DoubleSummaryStatistics collect1 = list.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));

        System.out.println(collect1);

    }
}
