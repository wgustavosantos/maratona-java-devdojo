package academy.devdojo.maratonajava.javacore.Bintroducaoametodos.test;


import academy.devdojo.maratonajava.javacore.Bintroducaoametodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaoametodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();

        estudante01.nome = "Gustavo";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        Estudante estudante02 = new Estudante();

        estudante02.nome = "Gustavo";
        estudante02.idade = 19;
        estudante02.sexo = 'M';

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

    }
}
