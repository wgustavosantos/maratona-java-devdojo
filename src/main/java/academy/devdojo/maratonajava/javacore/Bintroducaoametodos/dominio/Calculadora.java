package academy.devdojo.maratonajava.javacore.Bintroducaoametodos.dominio;

import java.util.ArrayList;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void multiplicaDoisNumeros(int a, int b) {
        System.out.println(a*b);
    }

    public float divideDoisNumeros(float a, float b) {
        return a/b;
    }

    public void alteraDoisNumeros (int n1, int n2){
        n1 = 99;
        n2 = -99;
    }

    public void somaNumeros(int... numeros){

        int total = 0;
        for (int numero:numeros) {
            total += numero;
        }
        System.out.println(total);
    }

}
