package academy.devdojo.maratonajava.javacore.Bintroducaoametodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaoametodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Gutsavo");
        pessoa.setIdade(123);

        System.out.println(pessoa.getNome() + pessoa.getIdade());

    }
}
