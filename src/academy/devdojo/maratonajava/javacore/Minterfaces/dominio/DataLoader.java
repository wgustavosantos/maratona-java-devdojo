package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    void load();

    default void checkPermission(){
        System.out.println("Checando permissão de acesso ao banco de dados - level interface");
    }
}
