package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.dominio.Aircraft;
import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.dominio.AircraftSingleEager;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        AircraftTest01.bookSeat("1A");
    }

    private static void bookSeat(String seat){
        AircraftSingleEager aircraft = AircraftSingleEager.getInstance();
        System.out.println(aircraft.bookSeat(seat));
    }
}
