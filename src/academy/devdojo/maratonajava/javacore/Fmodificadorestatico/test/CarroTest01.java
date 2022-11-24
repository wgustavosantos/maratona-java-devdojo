package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Merces ", 280);
        Carro c3 = new Carro("BMW", 280);

        System.out.println(c1.getVelocidadeLimite());
        c3.setVelocidadeLimite(390);
        System.out.println(c1.getVelocidadeLimite());

    }
}
