package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios; // não é possível acessar atributos de instância em blocos estáticos
    //0 - Bloco de inicialização estático é executado quando a JVM carregar a classe
    //1 - Alocado espaço em memória pro objeto
    //2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    //3 - Bloco de inicialização é executado
    //4 - Construtor é executado

    static { // executado somente 1 vez
        episodios = new int[12];
        for (int i = 0; i < episodios.length; i++)
            episodios[i] = i+1;
        System.out.println("Dentro do bloco");
    }

    public Anime() {

    }

    public Anime(String nome, int... episodios) {
        this.nome = nome;
        this.episodios = episodios;
    }

    public void imprime(){
        for (int ep: episodios) {
            System.out.println(ep);
        }
    }

}
