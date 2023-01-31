package academy.devdojo.maratonajava.javacore.ZZKjunit.test;

import academy.devdojo.maratonajava.javacore.ZZKjunit.dominio.Person;
import academy.devdojo.maratonajava.javacore.ZZKjunit.service.PersonService;

public class PersonServiceTest01 {
    public static void main(String[] args) {
        Person p = new Person(15);
        PersonService personService = new PersonService();
        personService.isAdult(p);
    }
}
