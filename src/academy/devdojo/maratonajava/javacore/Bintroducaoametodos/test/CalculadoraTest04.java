package academy.devdojo.maratonajava.javacore.Bintroducaoametodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaoametodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int n1 = 1;
        int n2 = 2;

        calculadora.alteraDoisNumeros(n1, n2);
        System.out.println(n1);

    }
}
