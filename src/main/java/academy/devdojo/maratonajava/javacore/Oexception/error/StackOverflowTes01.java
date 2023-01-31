package academy.devdojo.maratonajava.javacore.Oexception.error;

import java.io.File;
import java.io.IOException;

public class StackOverflowTes01 {
    public static void main(String[] args) {
        System.out.println("inicio da excecução");
        criar();
        System.out.println("final da excecução");
    }

    public static void criar(){
        File file = new File("");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("mostrando a exceção");
            e.printStackTrace();
            System.out.println("encerrando a exceção");
        }
    }
}
