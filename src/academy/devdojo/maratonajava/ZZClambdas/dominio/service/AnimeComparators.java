package academy.devdojo.maratonajava.ZZClambdas.dominio.service;

import academy.devdojo.maratonajava.ZZClambdas.dominio.Anime;

public class AnimeComparators {

    public static int animeByEpisodes(Anime a1, Anime a2){
        return Integer.compare(a1.getQuantity(), a2.getQuantity());
    }
}
