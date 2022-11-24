package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init(12, "Akudama Drive", "Ação");
        anime.init(12, "Akudama Drive", "Ação", "Streaming");
    }
}
