package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class StreamTest06 {
    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));
    public static void main(String[] args) {
        /*Retorna true se algum elemento deste stream corresponde ao predicate fornecido.*/
        final boolean b = list.stream().anyMatch(ln -> ln.getPrice() == 3.99);
        System.out.println("Existe algum light novel com preço igual a 3.99? " + b);

        /*Retorna true se todos os elementos deste fluxo correspondem ao predicado fornecido
        * true se o stream for vazio*/
        final boolean b1 = list.stream().allMatch(ln -> ln.getPrice() >= 10.00);
        System.out.println("Percorrendo todos os elementos do stream, existe algum com preço maior que 10.00? " + b1);

        /*true se nenhum elemento do fluxo corresponder ao predicado fornecido
         ou se o fluxo estiver vazio, caso contrário, false */
        final boolean b2 = list.stream().noneMatch(ln -> ln.getPrice() < 0.00);
        System.out.println("Todos os elementos do stream tem preço positivo ? " + b2);

        /*filtra elementos de acordo com o predicado e retorna um stream desses elementos
        * findAny retorna em um optional qualquer um dessa lista
        **/
        list.stream().filter(ln -> ln.getPrice() > 55.0).findAny().orElseThrow(() -> new NoSuchElementException("Elemento não encontrado"));

        list.stream()
                .filter(ln -> ln.getPrice() > 55.0)
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .findAny()
                .orElseThrow(() -> new NoSuchElementException("Elemento não encontrado"));

        list.stream()
                .filter(ln -> ln.getPrice() > 55.0)
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Elemento não encontrado"));

        list.stream()
                .filter(ln -> ln.getPrice() > 55.0).min(Comparator.comparing(LightNovel::getTitle))
                .orElseThrow(() -> new NoSuchElementException("Elemento não encontrado"));
    }
}
