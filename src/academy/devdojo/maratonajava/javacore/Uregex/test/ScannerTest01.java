package academy.devdojo.maratonajava.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Gustavo, Leandro, Taylor";
        String[] nomes = texto.split(",");

        for (String nome : nomes) {
            System.out.println(nome.trim());
        }


    }
}
