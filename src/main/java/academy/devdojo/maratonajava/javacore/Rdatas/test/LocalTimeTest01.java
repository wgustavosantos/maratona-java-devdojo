package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(23, 12, 10);
        LocalTime localTimeNow = LocalTime.now();

        System.out.println(localTimeNow);
        System.out.println(localTime);

    }
}
