package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> linguagens = new ArrayList<>();
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("Javascript");
        linguagens.add("Ruby");
        linguagens.add("Go");

        System.out.println("Antes da ordenação com Collections.sort");
        for(String leng : linguagens){
            System.out.print(leng + " ");
        }

        Collections.sort(linguagens);

        System.out.println("\nDepois da ordenação com Collections.sort");
        for(String leng : linguagens){
            System.out.print(leng + " ");
        }
    }
}
