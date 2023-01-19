package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Linguagem;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.*;

class SmartphoneSerialComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getSerialNumber().compareTo(o2.getSerialNumber());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneSerialComparator());

        Smartphone s1 = new Smartphone("123", "Nokia");

        set.add(s1);

        NavigableSet<Linguagem> linguagens = new TreeSet<>();

        linguagens.add(new Linguagem(2L, "BASIC", 5.250D));
        linguagens.add(new Linguagem(1L, "Java", 8.850D));

        linguagens.add(new Linguagem(3L, "Ruby", 6.850D));

        for (Linguagem linguagen : linguagens) {
            System.out.println(linguagen);
        }

    }
}
