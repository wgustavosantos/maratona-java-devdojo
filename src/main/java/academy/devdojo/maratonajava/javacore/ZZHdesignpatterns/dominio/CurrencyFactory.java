package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.dominio;

public class CurrencyFactory {
    public static Currency newCurrency(Country country) {
        return switch (country){
                case BRAZIL -> new Real();
                case USA -> new UsDollar();
                default -> throw new IllegalArgumentException("País não encontrado");
        };
    }
}
