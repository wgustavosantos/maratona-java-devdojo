package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class Fileloader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }
}
