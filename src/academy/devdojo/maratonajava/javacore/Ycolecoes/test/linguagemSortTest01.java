package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Linguagem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LinguagemBySalario implements Comparator<Linguagem>{

    @Override
    public int compare(Linguagem l1, Linguagem l2) {
        // if(this < 0) return negative
        // if(this == o) return zero
        // if(this > o) return positive
        if(l1.getSalario() < l2.getSalario())
            return -1;
        else if(l1.getSalario() > l2.getSalario())
            return 1;
        else
            return 0;
    }
}
public class linguagemSortTest01 {
    public static void main(String[] args) {

        List<Linguagem> linguagens = new ArrayList<>();
        linguagens.add(new Linguagem(2L, "BASIC", 5.250D));
        linguagens.add(new Linguagem(1L, "Java", 8.850D));

        linguagens.add(new Linguagem(3L, "Ruby", 6.850D));

        Collections.sort(linguagens);
        Collections.sort(linguagens, new LinguagemBySalario());

        for (Linguagem linguagen : linguagens) {
            System.out.println(linguagen);
        }


    }
}
