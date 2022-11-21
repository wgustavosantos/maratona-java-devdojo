package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        System.out.println("Carro 1 " + carro1);
        System.out.println("Carro 2" + carro2);

        carro1 = carro2;

        System.out.println(carro1);
        System.out.println(carro2);


    }
}
