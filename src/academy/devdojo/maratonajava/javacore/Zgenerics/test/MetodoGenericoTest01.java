package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {

        List<Carro> carros = criarArrayComUmObjeto(
                new Carro("BMW"),
                new Carro("Corsa"),
                new Carro("Fiat"));

        for (Carro carro : carros) {
            System.out.println(carro);
        }
    }

    public static <T> List<T> criarArrayComUmObjeto(T... t){
        return List.of(t);
    }
}
