package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();

        endereco.setRua("Rua 03");
        endereco.setCep("123456789");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Gustavo");
        pessoa.setCpf("04407090243");
        pessoa.setEndereco(endereco);

        Endereco endereco2 = new Endereco();


        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(12.1);
        funcionario.setCpf("07082012233");
        funcionario.setNome("Gabi");
        funcionario.setEndereco(endereco2);

        pessoa.imprime();
        funcionario.imprime();
    }
}
