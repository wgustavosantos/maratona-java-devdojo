package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumStreamParallelIterate(num);
        sumLongStreamIterate(num);
    }

    private static void sumFor(long num){
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for (int i = 0; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");
    }

    private static void sumStreamIterate(long num){
        System.out.println("Sum Stream Iterate");
        long init = System.currentTimeMillis();
        final Long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");
    }

    private static void sumStreamParallelIterate(long num){
        System.out.println("Sum Stream Parallel Iterate");
        long init = System.currentTimeMillis();
        final Long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");
    }

    private static void sumLongStreamIterate(long num){
        System.out.println("Sum Long Stream Iterate");
        long init = System.currentTimeMillis();
        final Long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");
    }

    private static void sumLongParallelStreamIterate(long num){
        System.out.println("Sum Long Parallel Stream Iterate");
        long init = System.currentTimeMillis();
        final Long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end-init) + "ms");
    }
}
