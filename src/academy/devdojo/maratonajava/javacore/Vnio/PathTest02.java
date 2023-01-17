package academy.devdojo.maratonajava.javacore.Vnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pathDiretorio = Paths.get("pathtest");

        if(Files.notExists(pathDiretorio)){
            Path pathDiretorioCriado = Files.createDirectory(pathDiretorio);
            System.out.println("Diretorio criado " + pathDiretorio);
        }


    }
}
