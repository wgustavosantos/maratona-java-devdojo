package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019));

    public static void main(String[] args) {
        List<Car> carsGreen = filterCarByColor(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green");
            }
        });
//        List<Car> listaCarro2000 = filterCarByColor(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getYear() >= 2000;
//            }
//        });



        List<Car> listaCarr = filterCarByColor(cars, car -> car.getYear() > 2000);



        System.out.println(carsGreen);
        System.out.println(listaCarr);
    }
    private static List<Car> filterCarByColor(List<Car> cars, CarPredicate carP) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars)
            if (carP.test(car))
                filteredCar.add(car);
        return filteredCar;
    }
}