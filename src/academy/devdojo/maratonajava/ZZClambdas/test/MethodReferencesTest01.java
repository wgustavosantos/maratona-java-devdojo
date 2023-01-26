package academy.devdojo.maratonajava.ZZClambdas.test;

import academy.devdojo.maratonajava.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.ZZClambdas.dominio.service.AnimeComparators;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferencesTest01 {
    public static void main(String[] args) {
        List<Anime> animes = Arrays.asList(
                new Anime("Bersek", 43),
                new Anime("Hellsing", 900),
                new Anime("Naruto", 500));

        Collections.sort(animes, (o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));

        animes.sort(AnimeComparators::animeByEpisodes);

        System.out.println(animes);
    }
}
