package academy.devdojo.maratonajava.javacore.ZZClambdas.exelambdas;

import java.util.Arrays;
import java.util.List;

public class LambdasTest03 {
    public static void main(String[] args) {
        System.out.println("Imprime todos os elementos da lista!");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);


        list.forEach( x -> System.out.println(x));
        list.forEach(System.out::println);

    }
}
