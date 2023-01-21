package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Linguagem;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class linguagemNameComparator implements Comparator<Linguagem>{

    @Override
    public int compare(Linguagem o1, Linguagem o2) {
        return o1.compareTo(o2);
    }
}

public class AnonymousClassTest02 {
    public static void main(String[] args) {
        List<Linguagem> barcoList = new ArrayList<>(List.of(
                new Linguagem(4L, "Java", 123),
                new Linguagem(2L, "C#", 123)));

        Collections.sort(barcoList, new Comparator<Linguagem>() {
            @Override
            public int compare(Linguagem o1, Linguagem o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(barcoList);
    }
}
