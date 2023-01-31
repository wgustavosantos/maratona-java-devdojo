package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019));
    /*--------------Lista definida-----------------------*/
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> numspares = filter(nums, num -> num % 2 == 0);
        List<Car> carsGreen = filter(cars, car -> car.getColor().equals("gree"));
        List<Car> listaCarr = filter(cars, car -> car.getYear() > 2000);
        List<Car> listaComClasseAnonima = filter(cars, new Predicate<Car>() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("red");
            }
        });

        System.out.println("Somente numeros pares: " + numspares);
        System.out.println("Somente carros verdes: " + carsGreen);
        System.out.println("Somente carros 2000+: " + listaCarr);
        System.out.println("Somente carros vermelhos: " + listaComClasseAnonima);



    }
    private static List<Car> filterCarByColor(List<Car> cars, CarPredicate carP) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars)
            if (carP.test(car))
                filteredCar.add(car);
        return filteredCar;
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> car){
        List<T> filteredeCars = new ArrayList<>();
        for(T e: list){
            if(car.test(e))
                filteredeCars.add(e);
        }
        return filteredeCars;
    }
}