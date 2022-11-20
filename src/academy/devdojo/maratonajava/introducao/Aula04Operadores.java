package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;

        System.out.println(numero1 + numero2);
        System.out.println(numero1 - numero2);
        System.out.println(numero1 * numero2);
        System.out.println(numero1 / numero2);
        System.out.println(numero1 + numero2 + " antes da String é operador aritmetico " + numero1 + numero2 );

        int resto = 20 % 2;

        // % resto
        System.out.println("Resto de 20 dividido por 2 eh " + resto);

        // sempre retorna booleano < > <= >= == !=

    }
}
