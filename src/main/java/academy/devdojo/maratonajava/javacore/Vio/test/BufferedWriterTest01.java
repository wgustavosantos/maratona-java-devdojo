package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("testeFileWriter.txt");
        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter bf = new BufferedWriter(fw)) {
            bf.write("ola"); //não é recomenável utilizar \n diretamente na escrita
            //pois nem todos os so utilizam ele como caractere de nova linha
            bf.newLine();
            bf.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
