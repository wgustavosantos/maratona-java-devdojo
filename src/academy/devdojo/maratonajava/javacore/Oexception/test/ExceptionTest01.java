package academy.devdojo.maratonajava.javacore.Oexception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        new StackOverflogtqwError("");
    }

    public static void criar(){
        File file = new File("");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
