package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Linguagem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Linguagem> linguagens = new HashSet<>();

        linguagens.add(new Linguagem(2L, "BASIC", 5.250D, 1975 ));
        linguagens.add(new Linguagem(1L, "Java", 8.850D, 1995));

        linguagens.add(new Linguagem(3L, "Ruby", 6.850D, 1999));

        for (Linguagem linguagen : linguagens) {
            System.out.println(linguagen);
        }

    }
}
