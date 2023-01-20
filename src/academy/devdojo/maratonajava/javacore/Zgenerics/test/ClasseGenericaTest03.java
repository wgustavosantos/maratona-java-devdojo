package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {

        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(
                new Carro("BMW"),
                new Carro("Mercedes"),
                new Carro("Fusca")
        ));

        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(
                new Barco("Lancha"),
                new Barco("Canoa"),
                new Barco("Iate")
        ));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        RentalService<Barco> rentalService2 = new RentalService<>(barcosDisponiveis);

        Carro carro = rentalService.buscarObjetoDisponivel();
        Barco barco = rentalService2.buscarObjetoDisponivel();

        System.out.println("Usando carro por um mês...");
        System.out.println("Usando barco por um mês...");

        rentalService.retornarObjetoAlugado(carro);
        rentalService2.retornarObjetoAlugado(barco);
    }
}
