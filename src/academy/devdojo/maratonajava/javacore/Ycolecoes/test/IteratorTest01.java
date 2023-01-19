package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Linguagem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {

        List<Linguagem> linguagens = new ArrayList<>();
        linguagens.add(new Linguagem(2L, "BASIC", 5.250D, 1975 ));
        linguagens.add(new Linguagem(1L, "Java", 8.850D, 1995));

        linguagens.add(new Linguagem(3L, "Ruby", 6.850D, 1999));

        Iterator<Linguagem> i = linguagens.iterator();

        while(i.hasNext()){
            if(i.next().getAno() > 1990)
                i.remove();
        }

        System.out.println(linguagens);

    }
}
