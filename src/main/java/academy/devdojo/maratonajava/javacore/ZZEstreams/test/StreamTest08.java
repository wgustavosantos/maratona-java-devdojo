package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/* Somatoria de todos os light novels com preço acima de 3*/
public class StreamTest08 {
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


        final Optional<Double> reduce = list.stream()
                .map(ln -> ln.getPrice())
                .filter(price -> price > 3.00)
                .reduce(Double::sum);

        reduce.ifPresent( (ln) -> System.out.println(ln));

        final double sum = list.
                stream()
                .mapToDouble
                        (LightNovel::getPrice)
                .filter(price -> price > 3.00)
                .sum();
    }
}
