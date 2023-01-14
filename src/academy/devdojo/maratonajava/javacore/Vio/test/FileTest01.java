package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.TimeZone;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Guto1\\stsworkspace\\maratona-java\\arquivo\\teste.txt");

        try {
            Boolean isCreated = file.createNewFile(); // nao sobrescreve um arquivo ja criado
            System.out.println("Criado " + isCreated);
            System.out.println("Path " + file.getPath());
            System.out.println("Nome " + file.getName());
            System.out.println("Path absoluto " + file.getAbsolutePath());
            System.out.println("Is directory " + file.isDirectory());
            System.out.println("Is file " + file.isFile());
            System.out.println("Is hidden " + file.isHidden());
            System.out.println("Is ultima modificacao " + file.lastModified());

//            LocalDateTime ldt = LocalDateTime.

            long test_timestamp = file.lastModified();
            LocalDateTime triggerTime =
                    LocalDateTime.ofInstant(Instant.ofEpochMilli(test_timestamp),
                            TimeZone.getDefault().toZoneId());

            System.out.println(triggerTime);

            System.out.println("Is ultima modificacao " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));


            Boolean isExist = file.exists();

            if(isExist){
                file.delete();

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
