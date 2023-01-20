package academy.devdojo.maratonajava.javacore.Zgenerics.test;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {
    private String nome;
    public Cachorro (){}
    public Cachorro (String nome){
        this.nome = nome;
    }
    @Override
    public void consulta() {
        System.out.println("Consultando um doguinho...");
    }
    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

class Gato extends Animal {
    private String nome;
    public Gato (){
    }
    public Gato (String nome){
        this.nome = nome;
    }
    @Override
    public void consulta() {
        System.out.println("Consultando um gatinho...");
    }
    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

public class WildCardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};

        Animal[] animals = cachorros;
        animals = gatos;
        printConsulta(cachorros);
        printConsulta(gatos);

        for (Cachorro cachorro : cachorros) {
            System.out.println(cachorro);
        }
        for (Gato gato : gatos) {
            System.out.println(gato);
        }
        //Animal[] animals = {new Cachorro(), new Gato()};
    }
    public static void printConsulta(Animal[] animais){
        for(int i = 0; i< animais.length; i++){
            if(animais[i] instanceof Cachorro)
                animais[i] = new Cachorro("Novo Cachorro");
            if(animais[i] instanceof Gato)
                animais[i] = new Gato("Novo Gato");
        }
    }
}
