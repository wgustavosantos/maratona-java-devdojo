package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import java.util.List;

public class RentalService <T> {

    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel(){
        System.out.println("*---------------------*");
        System.out.println("Buscando objeto disponivel...");
        T t = objetosDisponiveis.remove(0);
        System.out.println(("Alugando objeto: " + t));
        System.out.println("Objetos disponiveis para alugar:");
        System.out.println(objetosDisponiveis);
        System.out.println("*---------------------*");

        return t;
    }

    public void retornarObjetoAlugado(T t){
        System.out.println("*---------------------*");
        System.out.println("Devolvendo " + t.getClass().getSimpleName() + " alugado :" + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis para alugar:");
        System.out.println(objetosDisponiveis);
        System.out.println("*---------------------*");
    }
}
