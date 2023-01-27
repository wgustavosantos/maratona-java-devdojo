package academy.devdojo.maratonajava.javacore.ZZDoptional.repository;

import academy.devdojo.maratonajava.javacore.ZZDoptional.exercicio.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(
            new Manga(1, "Naruto", 50),
            new Manga(1, "Overlord", 60));

    public static Optional<Manga> findByName (String name){
        return findBy((manga) -> manga.getTitulo().equals(name));
    }
    public static Optional<Manga> findById (Integer id){
        return findBy(manga -> manga.getId().equals(id));
    }

    private static Optional<Manga> findBy (Predicate<Manga> mangaPredicate){
        Manga found = null;

        for(Manga manga : mangas){
            if(mangaPredicate.test(manga)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }

}
