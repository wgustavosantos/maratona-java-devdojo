package academy.devdojo.maratonajava.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {

        forEach(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        forEach(List.of("Gustavo", "Joice", "Leandro"), nome -> System.out.println(nome));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer){

        for(T e: list)
            consumer.accept(e);
    }
}

