package academy.devdojo.maratonajava.javacore.Bintroducaoametodos.dominio;

public class ImpressoraEstudante {
    public static void imprimeNome(Estudante... estudantes) {
        for(Estudante estudante: estudantes){
            System.out.println("Nome: " + estudante.nome);
            System.out.println("Idade: " + estudante.idade);
            System.out.println("Sexo: " + estudante.sexo);
        }
    }

    public void imprime(Estudante estudante){
        System.out.println("-----------------------------------");
        System.out.println(estudante.nome);
        estudante.nome = "dddd";
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
