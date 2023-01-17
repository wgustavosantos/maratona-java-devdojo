package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("testeFileWriter.txt");

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bf = new BufferedReader(fileReader)) {

            String linha;
            while ((linha= bf.readLine()) != null){
                System.out.println(linha);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
