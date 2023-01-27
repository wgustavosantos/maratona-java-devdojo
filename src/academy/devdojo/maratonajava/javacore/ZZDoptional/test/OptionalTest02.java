package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.exercicio.domain.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {

        final Optional<Manga> manga = MangaRepository.findByName("Overlord");
        final Optional<Manga> manga2 = MangaRepository.findById(1);

        manga.ifPresent(m -> m.setTitulo("Overlord II"));

        MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);

        MangaRepository.findByName("Overlord III").orElseGet( () -> new Manga(1,"Overlord III", 45));

    }
}
