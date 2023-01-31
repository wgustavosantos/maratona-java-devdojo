package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        int idade = 15;
        String categoria = null;

//        if(idade < 12){
//            categoria = "Juvenil";
//        } else if (idade >= 15 && idade < 18) {
//            categoria = "Categoria Juvenil";
//        } else {
//            categoria = "categoria adulto";
//        }

        categoria = idade < 15 ? "Categoria infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto";
        
        System.out.println(categoria);
    }
}
