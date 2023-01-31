package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.dominio.Person;

public class BuilderTest01 {
    public static void main(String[] args) {
        new Person.PersonBuilder().firstName("Gustavo").lastName("Santos").username("httpsgustavo").email("@").build();

    }
}
