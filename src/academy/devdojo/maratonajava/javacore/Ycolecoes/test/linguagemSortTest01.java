package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Linguagem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class linguagemSortTest01 {
    public static void main(String[] args) {

        List<Linguagem> linguagens = new ArrayList<>();
        linguagens.add(new Linguagem(2L, "BASIC", 5.250D));
        linguagens.add(new Linguagem(1L, "Java", 8.850D));

        linguagens.add(new Linguagem(3L, "Ruby", 6.850D));

        Collections.sort(linguagens);

        for (Linguagem linguagen : linguagens) {
            System.out.println(linguagen);
        }


    }
}
