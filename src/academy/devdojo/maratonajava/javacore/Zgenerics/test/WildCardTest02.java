package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = new ArrayList<>(List.of(new Cachorro(), new Cachorro()));
        List<Gato> gatos = new ArrayList<>(List.of(new Gato(), new Gato()));

        printConsulta(cachorros);
        printConsulta(gatos);

        for (Cachorro cachorro : cachorros) {
            System.out.println(cachorro);
        }
        for (Gato gato : gatos) {
            System.out.println(gato);
        }


        //Animal[] animals = {new Cachorro(), new Gato()};

    }

    public static void printConsulta(List<Animal> animais){

        for(int i = 0; i< animais.size(); i++){
            if(animais.get(i) instanceof Cachorro)
                System.out.println("Cachorro");
            if(animais.get(i) instanceof Gato)
                System.out.println("Gato");
        }

    }
}
