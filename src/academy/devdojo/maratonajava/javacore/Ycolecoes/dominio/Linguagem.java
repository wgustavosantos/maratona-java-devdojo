package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Linguagem implements Comparable<Linguagem> {
    private Long id;
    private String nome;
    private double salario;

    public Linguagem(Long id, String nome, double salario) {
        Objects.requireNonNull(nome, "atributo nome nulo.");
        Objects.requireNonNull(salario, "atributo salario nulo.");
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Linguagens{" +
                "id=" + id +
                ", a='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linguagem that = (Linguagem) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Linguagem o) {
        // if(this < 0) return negative
        // if(this == o) return zero
        // if(this > o) return positive

        // refatorando
//        if(this.id < o.getId())
//            return -1;
//        else if (this.id > o.getId())
//            return 1;
//        else
//            return 0;

        return this.id.compareTo(o.getId());
    }
}
