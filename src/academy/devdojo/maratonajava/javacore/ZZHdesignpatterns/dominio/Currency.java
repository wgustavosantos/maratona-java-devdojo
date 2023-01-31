package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.dominio;

public interface Currency {
    public String getSymbol();
}

class Real implements Currency {
    @Override
    public String getSymbol() {
        return "R$";
    }
}

class UsDollar implements Currency {
    @Override
    public String getSymbol() {
        return "$";
    }
}
