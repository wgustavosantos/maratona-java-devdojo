package academy.devdojo.maratonajava.javacore.Vnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\Guto1\\stsworkspace\\maratona-java\\pasta\\teste.txt");
        System.out.println( p1.getFileName());
    }
}
