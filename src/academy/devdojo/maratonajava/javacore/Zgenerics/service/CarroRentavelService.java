package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(
            new Carro("BMW"),
            new Carro("Mercedes"),
            new Carro("Fusca")
    ));

    public Carro buscarBarcoDisponivel(){
        System.out.println("*---------------------*");
        System.out.println("Buscando carro disponivel...");
        Carro c = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + c);
        System.out.println("Carros disponiveis para alugar:");
        System.out.println(carrosDisponiveis);
        System.out.println("*---------------------*");

        return c;
    }

    public void retornarCarroAlugado(Carro carro){
        System.out.println("*---------------------*");
        System.out.println("Devolvendo carro alugado :" + carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponiveis para alugar:");
        System.out.println(carrosDisponiveis);
        System.out.println("*---------------------*");
    }
}
