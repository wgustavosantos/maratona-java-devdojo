package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferencesTest03 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Gustavo", "Taylor", "Windligy"));

        nomes.sort(String::compareTo);

        Function<String, Integer> function = s -> Integer.parseInt(s);

        Function<String, Integer> function1 = Integer::parseInt;

        System.out.println(function1.apply("562"));

        Predicate<List<String>> predicate = MethodReferencesTest03::test;

        BiPredicate<List<String>, String > checkName = List::contains;


        //predicate.test(nomes);
        System.out.println(predicate.test(nomes));
    }

    private static boolean test(List<String> s) {
        return s.contains("Gustavoc");
    }
}
