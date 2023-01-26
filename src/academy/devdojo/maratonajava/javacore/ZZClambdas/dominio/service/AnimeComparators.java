package academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.service;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;

public class AnimeComparators {

    public static int animeByEpisodes(Anime a1, Anime a2){
        return Integer.compare(a1.getQuantity(), a2.getQuantity());
    }
    public int animeByEpisodesNonStatic(Anime a1, Anime a2){
        return Integer.compare(a1.getQuantity(), a2.getQuantity());
    }
}
