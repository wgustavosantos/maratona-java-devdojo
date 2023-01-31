package academy.devdojo.maratonajava.javacore.Bintroducaoametodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaoametodos.dominio.Calculadora;
import academy.devdojo.maratonajava.javacore.Bintroducaoametodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaoametodos.dominio.ImpressoraEstudante;

public class CalculadoraTest05 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        calculadora.somaNumeros(1,2,3,4,5);

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Gustavo";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Gustavo";
        estudante02.idade = 19;
        estudante02.sexo = 'M';

        ImpressoraEstudante.imprimeNome(estudante01,estudante02);

    }
}
