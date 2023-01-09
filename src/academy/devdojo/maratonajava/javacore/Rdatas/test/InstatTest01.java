package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

/* Instante trabalha com nanossegundos*/
public class InstatTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();

        System.out.println(LocalDateTime.now());
        System.out.println(now);
    }
}
