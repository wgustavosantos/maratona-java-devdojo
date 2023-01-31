package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingleEager {
    //Eager initialization
    private static final AircraftSingleEager INSTANCE = new AircraftSingleEager("787-900");
    private final Set<String> availableSeats = new HashSet<>();
    private String name;

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    private AircraftSingleEager(String name){
        this.name = name;
    }

    public static AircraftSingleEager getInstance(){
        return INSTANCE;
    }

    public boolean bookSeat (String seat){
        return availableSeats.remove(seat);
    }

    public String getName (){
        return name;
    }
}
