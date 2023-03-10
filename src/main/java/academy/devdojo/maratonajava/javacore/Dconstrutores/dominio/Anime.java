package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;
    private String estudio;


    public Anime(String tipo, int episodios, String nome, String genero) {
        this.tipo = tipo;
        this.episodios = episodios;
        this.nome = nome;
        this.genero = genero;
    }

    public Anime(String tipo, int episodios, String nome, String genero, String estudio) {
        this(tipo, episodios, nome, genero);
        this.estudio = estudio;
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
