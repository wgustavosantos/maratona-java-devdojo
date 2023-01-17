package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.TimeZone;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean mkdir = fileDiretorio.mkdir();

        System.out.println(mkdir);

        //File file2 = new File(file.getAbsolutePath() + "\\teste.txt");
        File file2 = new File(fileDiretorio,"teste.txt");

        boolean newFile = file2.createNewFile();

        System.out.println(newFile);
    }
}
