package academy.devdojo.maratonajava.javacore.ZZDoptional.exercicio.domain;

public class Manga {
    private Integer id;
    private String titulo;

    private int chapters;

    public Manga(Integer id, String titulo, int chapters) {
        this.id = id;
        this.titulo = titulo;
        this.chapters = chapters;
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }
}
