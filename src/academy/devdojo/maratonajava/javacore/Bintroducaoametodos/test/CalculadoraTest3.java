package academy.devdojo.maratonajava.javacore.Bintroducaoametodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaoametodos.dominio.Calculadora;

public class CalculadoraTest3 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.multiplicaDoisNumeros(2,5);
        float resultado = calculadora.divideDoisNumeros(2.5f, 6.3f);
        System.out.println(resultado);
    }
}
