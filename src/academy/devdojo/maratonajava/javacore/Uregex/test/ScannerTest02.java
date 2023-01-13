package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Gustavo, Leandro, Taylor";
        String texto2 = "Gustavo,Leandro,200,true,30,10.5D,guto,true";

        List<String> nomes = new ArrayList<String>();
        List<Integer> inteiros = new ArrayList<Integer>();
        List<Boolean> booleans = new ArrayList<Boolean>();

        Scanner scanner = new Scanner(texto2);
        scanner.useDelimiter(",");

        while(scanner.hasNext()){
            if(scanner.hasNextInt()){
                inteiros.add(scanner.nextInt());
            } else if(scanner.hasNextBoolean()){
                booleans.add(scanner.nextBoolean());
            } else {
                nomes.add(scanner.next());
            }
        }



        while (scanner.hasNext()){

            nomes.add(scanner.next().trim());
        }


        System.out.println(nomes);


    }
}
