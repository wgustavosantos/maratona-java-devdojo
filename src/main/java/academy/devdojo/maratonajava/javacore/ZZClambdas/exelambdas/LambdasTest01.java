package academy.devdojo.maratonajava.javacore.ZZClambdas.exelambdas;

public class LambdasTest01 {
    public static void main(String[] args) {
        /*Tipos de lambdas criando ums instância de Thread */
        /*O construtor de Thread recebe um Runnable */
        /*Runnable é uma interface funcional */
        final Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Exemplo 1");
            }
        });
        t1.start();

        Runnable r1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Exemplo 2");
            }
        });
        r1.run();

        Runnable r2 = () -> System.out.println("Exemplo 3");


        Thread thread1 = new Thread(() -> System.out.println("Exemplo 4"));
        // se ter somente um(1) comando
        thread1.run();

    }
}
