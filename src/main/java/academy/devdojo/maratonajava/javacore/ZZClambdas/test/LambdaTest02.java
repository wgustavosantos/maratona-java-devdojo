package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Gustavo", "Joice", "Leandro", "Gabrieli");
        final List<Object> objectList = map(nomes, new Function<String, Object>() {
            @Override
            public Object apply(String s) {
                return s.length();
            }
        });
        final List<Integer> integers = map(nomes, (String s) -> s.length());

        System.out.println(objectList);
        System.out.println(integers);

    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();

        for (T e: list){
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
