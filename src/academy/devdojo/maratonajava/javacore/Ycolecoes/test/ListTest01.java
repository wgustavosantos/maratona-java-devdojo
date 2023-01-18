package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);

        nomes.add("Gustavo");
        nomes.add("Gabriele");

        nomes2.add("Wenderson");
        nomes2.add("Gabi");

        nomes.addAll(nomes2);

        for (String nome:nomes) {
            System.out.println(nome);
        }
    }
}
