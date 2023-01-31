package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FuncionLambdaTest01 {
    public static void main(String[] args) {

        List<String> nomes = List.of("Gustavo", "Joice", "Leandro", "Gabrieli", "taylor");

        final List<Integer> numeLetrasNome = map(nomes, String::length);

        System.out.println(numeLetrasNome);
    }

    public static <T, R> List<R> map (List<T> objList, Function<T, R> function){
        List<R> list = new ArrayList<>();

        for(T t: objList){
            final R r = function.apply(t);

            list.add(r);
        }
        return list;
    }
}
