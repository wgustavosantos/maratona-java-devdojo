package academy.devdojo.maratonajava.javacore.Bintroducaoametodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("-----------------------------------");
        System.out.println(estudante.nome);
        estudante.nome = "dddd";
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
