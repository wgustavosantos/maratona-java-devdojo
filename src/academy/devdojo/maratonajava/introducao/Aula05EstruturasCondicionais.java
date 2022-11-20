package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        int idade = 15;
        String categoria = null;

        if(idade < 12){
            categoria = "Juvenil";
        } else if (idade > 18) {
            categoria = "Adulto";
        }
        
        System.out.println(categoria);

    }
}
