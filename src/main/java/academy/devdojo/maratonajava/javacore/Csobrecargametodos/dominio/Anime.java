package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;

    public void init(int episodios, String nome, String genero){
        this.episodios = episodios;
        this.nome = nome;
        this.genero = genero;
    }

    public void init(int episodios, String nome, String genero, String tipo){
        this.episodios = episodios;
        this.nome = nome;
        this.genero = genero;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
