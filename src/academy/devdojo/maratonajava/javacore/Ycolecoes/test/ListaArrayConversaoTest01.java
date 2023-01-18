package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(12);
        numeros.add(13);

        Integer[] arrayCriadoDeUmList = numeros.toArray(new Integer[0]);

        System.out.println("array criado de uma lista" + Arrays.toString(arrayCriadoDeUmList));

//        List<Integer> listCriadoDeUmArray = Arrays.asList(arrayCriadoDeUmList);
//
//        listCriadoDeUmArray.add(55);

        List<Integer> listaCriadaDeUmArray = new ArrayList<>(Arrays.asList(arrayCriadoDeUmList));

        listaCriadaDeUmArray.add(19);
        System.out.println("lista criada de um array" + listaCriadaDeUmArray);
        System.out.println("array criado de uma lista" + Arrays.toString(arrayCriadoDeUmList));

        List<Integer> ddd = Arrays.asList(1, 2, 3, 4, 5);
    }
}
