package academy.devdojo.maratonajava.ZZClambdas.test;

import academy.devdojo.maratonajava.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.ZZClambdas.dominio.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//referencia para construtor
//criar lambdas para instanciar objetos
public class MethodReferencesTest04 {
    public static void main(String[] args) {

        List<Anime> animes = Arrays.asList(
                new Anime("Bersek", 43),
                new Anime("Hellsing", 900),
                new Anime("Naruto", 500));

        /* Interface funcional que retorna uma instância de AnimeComparators*/
        Supplier<AnimeComparators> animeComparatorsSupplier = AnimeComparators::new;
        AnimeComparators animeComparators = animeComparatorsSupplier.get();
        animes.sort(animeComparators::animeByEpisodesNonStatic);
        System.out.println(animes);

    }
}
