package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final String nomeRelatorio;
    private final int valor;

    private TipoCliente(int valor, String nomeRelatorio){
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public int getValor(){
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
