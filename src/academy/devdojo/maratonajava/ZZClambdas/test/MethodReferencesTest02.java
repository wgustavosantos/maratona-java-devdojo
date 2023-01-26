package academy.devdojo.maratonajava.ZZClambdas.test;

import academy.devdojo.maratonajava.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.ZZClambdas.dominio.service.AnimeComparators;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferencesTest02 {
    public static void main(String[] args) {
        List<Anime> animes = Arrays.asList(
                new Anime("Bersek", 43),
                new Anime("Hellsing", 900),
                new Anime("Naruto", 500));

       AnimeComparators animeComparators = new AnimeComparators();
       /*Method reference in method non static, referenciando um método de um obj */
       animes.sort(animeComparators::animeByEpisodesNonStatic);
       /*Usando lambda */
       animes.sort((o1, o2) -> AnimeComparators.animeByEpisodes(o1, o2));
    }
}
