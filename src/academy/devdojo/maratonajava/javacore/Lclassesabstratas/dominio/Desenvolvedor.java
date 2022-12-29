package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.05;
        System.out.println("Calcula bonus dentro de Desenvolvedor");
    }
    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';

    }
    @Override
    public void imprime() {
        System.out.println("Imprimindo relatorio de desenvolvedor...");
    }
}
