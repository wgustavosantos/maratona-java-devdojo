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

        //&& (AND) || (OR)

        int idade = 35;
        float salario = 1200.00F;
        boolean isDentroDaLeiMaiorQueTreina = idade > 30 && salario > 4612;

        boolean isUmouOutro = 16 > 30 || 16 < 30;
        System.out.println("Ou um outro outro pode ser falso " + isUmouOutro);

        // = += -= /= %=

        double bonus = 1800;
        bonus += 200;
        bonus -= 200;
        bonus /= 200;
        bonus %= 2;
        System.out.println(bonus);

        // Operadores unários


        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }



    }
}
