package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(
            new Barco("Lancha"),
            new Barco("Iate"),
            new Barco("Canoa")
    ));

    public Barco buscarCarroDisponivel(){
        System.out.println("*---------------------*");
        System.out.println("Buscando Barco disponivel...");
        Barco b = barcosDisponiveis.remove(0);
        System.out.println("Alugando Barco: " + b);
        System.out.println("Barcos disponiveis para alugar:");
        System.out.println(barcosDisponiveis);
        System.out.println("*---------------------*");

        return b;
    }

    public void retornarCarroAlugado(Barco Barco){
        System.out.println("*---------------------*");
        System.out.println("Devolvendo Barco alugado :" + Barco);
        barcosDisponiveis.add(Barco);
        System.out.println("Barcos disponiveis para alugar:");
        System.out.println(barcosDisponiveis);
        System.out.println("*---------------------*");
    }
}
