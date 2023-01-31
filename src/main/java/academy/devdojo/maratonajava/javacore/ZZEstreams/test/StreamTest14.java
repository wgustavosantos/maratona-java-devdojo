package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class StreamTest14 {
    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 10.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)));
    public static void main(String[] args) {
        /*Contar os light novels por categoria e agrupar por cat e o maior preço*/

        final Map<Category, Long> collect = list.stream().collect(groupingBy(LightNovel::getCategory, Collectors.counting()));

        System.out.println(collect);

        /*Maior preço entre cada categoria  */
        final Map<Category, Optional<LightNovel>> collect1 = list
                .stream().collect(groupingBy(LightNovel::getCategory,
                        Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));

        /*Maior preço entre cada categoria sem optional*/
        final Map<Category, LightNovel> collect2 = list.stream()
                .collect(groupingBy(LightNovel::getCategory,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));

        final Map<Category, LightNovel> collect3 = list.stream()
                .collect(Collectors.toMap(LightNovel::getCategory, Function.identity(),
                        BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
    }
}
