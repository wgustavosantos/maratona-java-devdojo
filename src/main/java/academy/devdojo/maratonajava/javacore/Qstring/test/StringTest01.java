package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Gustavo"; //String constant pool
        String nome2 = "Gustavo";
        String nome3 = nome2;
        nome2 = nome2.concat(" Santos");

        System.out.println(nome == nome2); // compara referências
        System.out.println(nome2 + nome3);

    }
}
