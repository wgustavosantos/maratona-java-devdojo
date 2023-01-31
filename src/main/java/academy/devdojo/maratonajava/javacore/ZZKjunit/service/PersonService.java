package academy.devdojo.maratonajava.javacore.ZZKjunit.service;

import academy.devdojo.maratonajava.javacore.ZZKjunit.dominio.Person;

import java.util.Objects;

public class PersonService{

    public boolean isAdult(Person person){
        Objects.requireNonNull(person, "A pessoa não pode ser null");
         return person.getAge() >= 18;
    }
}
