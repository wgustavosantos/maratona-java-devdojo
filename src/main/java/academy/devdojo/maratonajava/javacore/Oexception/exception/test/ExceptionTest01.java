package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {

    }

    private static void criarArquivo(){
        File file = new File("arquivo\\teste.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {

        }
    }
}
