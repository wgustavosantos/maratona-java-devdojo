package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Linguagem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
       Consumidor c1 = new Consumidor("Gustavo");
       Consumidor c2 = new Consumidor("Gabi");
       Consumidor c3 = new Consumidor("Leandro");
       Consumidor c4 = new Consumidor("Joice");
       Consumidor c5 = new Consumidor("Jamille");
       Consumidor c6 = new Consumidor("Taylor");

       Linguagem l1 = new Linguagem(2L, "BASIC", 5.250D);
       Linguagem l2 = new Linguagem(1L, "Java", 8.850D);
       Linguagem l3  = new Linguagem(3L, "Ruby", 6.850D);
       Linguagem l4  = new Linguagem(3L, "Javascript", 6.850D);
       Linguagem l5  = new Linguagem(3L, "Swift", 6.850D);
       Linguagem l6  = new Linguagem(3L, "C#", 6.850D);

        Map<Consumidor, List<Linguagem>> devs = new HashMap<>();


        devs.put(c1, List.of(l6, l5));
        devs.put(c2, List.of(l5, l4));
        devs.put(c3, List.of(l4, l3));
        devs.put(c4, List.of(l3, l2));
        devs.put(c5, List.of(l2, l1));
        devs.put(c6, List.of(l1, l6));


        for(Map.Entry<Consumidor, List<Linguagem>> dev : devs.entrySet()){
            System.out.println(dev);
        }

        System.out.println(c1);
        System.out.println(c2);
    }
}
