package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "  Gustavo,Santos     ";
        nome = nome.trim();
        System.out.println("Remove os espaços no inicio e/ou no fim da String " + nome.trim());
        System.out.println("caractere no indice 0 " + nome.charAt(0) + " .");
        System.out.println("Tamanho da String " + nome.length());
        System.out.println("Trocando o 'o' pelo '0' " + nome.replace("o", "0"));
        System.out.println("Pegando a String a partir do indice 4 " + nome.substring(4));
        System.out.println("Pegando a String a entre o indice 1 e 5 " + nome.substring(1, 5));
        System.out.println("Troca o 'Gus' por 'Sug' " + nome.replace("Gus", "Sug"));

        System.out.println("Divindo um array de String a partir de um caractere definido: ");

        String[] vet = nome.split(",");
        for (String s : vet) {
            System.out.println(s + " - ");
        }

    }
}
