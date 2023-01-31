package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Linguagem;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {

        //TYPE ERASURE
        //Tipo apagado
        List<String> lista = new ArrayList<>(List.of("Gustavo", "Joice", "Jamille"));
        for (String s : lista) {
            System.out.println(s);
        }


        //funciona
        add(lista, new Linguagem(1L, "Java", 12D));
        //nao funciona
        for (String s : lista) {
            System.out.println(s);
        }
    }
    public static void add(List lista, Linguagem linguagem){
        lista.add(linguagem);
    }
}
