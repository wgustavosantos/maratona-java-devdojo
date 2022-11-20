package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        boolean isAutorizado = true;

        if (!isAutorizado){
            System.out.println("Está autorizado");
        } else if ((!isAutorizado) == false){
            System.out.println("Dentro do else if");
        }
        else{
            System.out.println("Invalido");
        }

    }
}
