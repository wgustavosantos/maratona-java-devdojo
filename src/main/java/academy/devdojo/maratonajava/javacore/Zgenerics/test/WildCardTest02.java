package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = new ArrayList<>(List.of(new Cachorro(), new Cachorro()));
        List<Gato> gatos = new ArrayList<>(List.of(new Gato(), new Gato()));

        pprintConsulta(cachorros);
        pprintConsulta(gatos);

        for (Cachorro cachorro : cachorros) {
            System.out.println(cachorro);
        }
        for (Gato gato : gatos) {
            System.out.println(gato);
        }
    }
    //extends - qualquer lista que seja filha/subclasse de Animal
    public static void pprintConsulta(List<? extends Animal> animais){
//        erro
//        animais.add(new Gato());
//        animais.add(new Cachorro());
        for(int i = 0; i< animais.size(); i++){
            if(animais.get(i) instanceof Cachorro)
                System.out.println("Cachorro");
            if(animais.get(i) instanceof Gato)
                System.out.println("Gato");
        }
    }

    //extends - qualquer lista que seja ela mesma/pai/superclasse de Animal
    public static void ppprintConsulta(List<? super Animal> animais){
        animais.add(new Gato());
        animais.add(new Cachorro());

    }
}
