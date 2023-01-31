package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {

        try{
            divisao(1,0);
        } catch(IllegalArgumentException e){
            e.printStackTrace();
        }

        System.out.println("Codigo finalizado");
    }

    private static int divisao (int a, int b) throws IllegalArgumentException{

        if(a == 0 || b == 0){
            throw new IllegalArgumentException("Argumento inválido");
        }
        return a/b;
    }
}
