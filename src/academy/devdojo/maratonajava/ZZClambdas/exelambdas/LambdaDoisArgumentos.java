package academy.devdojo.maratonajava.ZZClambdas.exelambdas;

interface VerificaSeEhPar {
    boolean verificaPar(int a);
}

public class LambdaDoisArgumentos {
    public static void main(String[] args) {

        /* recebendo uma instância
        * que faz o método verificar se resto de a dividido por b eh 0*/
        VerificaSeEhPar ehPar = a -> a%2==0;


        System.out.println(ehPar.verificaPar(2));


    }
}
