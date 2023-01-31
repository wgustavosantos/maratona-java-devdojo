package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.dominio.Aircraft;
import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.dominio.AircraftSingleEager;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    public static void bookSeat(String seat){
        AircraftSingleEager aircraftSingleEager = AircraftSingleEager.getInstance();
        System.out.println(aircraftSingleEager.bookSeat(seat));
    }
}
