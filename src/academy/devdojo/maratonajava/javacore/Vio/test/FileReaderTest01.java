package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("testeFileWriter.txt");

        try (FileReader fileReader = new FileReader(file)) {

            int a;
            while ((a=fileReader.read()) != -1){
                System.out.print((char)a);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
