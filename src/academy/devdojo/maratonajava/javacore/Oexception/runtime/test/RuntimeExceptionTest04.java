package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
    abreConexao();

    }

    private static void abreConexao(){
        try {
            System.out.println("Simulando - Abrindo conexão");
            throw new RuntimeException("Simulando - Erro");

        } catch (RuntimeException e){
            e.printStackTrace();
        } finally {
            System.out.println("Simulando - Fechando a conexão (O bloco Finally sempre é executado)");
        }
    }
}
