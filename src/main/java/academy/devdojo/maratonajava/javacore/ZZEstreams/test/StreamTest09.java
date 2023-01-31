package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,50).filter( n -> n%2 == 0).forEach(System.out::println);
        IntStream.range(1,50).filter( n -> n%2 == 0).forEach(System.out::println);

        final List<String> list =  Stream.of("gustav", "opa", "kkkk")
                .map(String::toUpperCase).toList();

        System.out.println(list);

         int[] nums = {1,2,3,4,5};
         double[] nums2 = {1,2,3,4,5};
        final int sum = Arrays.stream(nums).sum();

        final List<Double> doubles = List.of(200.3, 650.0, 1.20, 2.1);

        final double sum1 = DoubleStream.of().sum();


    }
}
