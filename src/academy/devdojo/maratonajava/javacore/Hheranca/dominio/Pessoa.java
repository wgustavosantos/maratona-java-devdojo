package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco Endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco endereco) {
        Endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", Endereco=" + Endereco +
                '}';
    }
}
