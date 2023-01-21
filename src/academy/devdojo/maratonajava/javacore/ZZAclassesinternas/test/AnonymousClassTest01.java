package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

class Animal {
    public void walk(){
        System.out.println("Animal Walking");
    }
}
public class AnonymousClassTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.walk();

        Animal animal1 = new Animal(){
            @Override
            public void walk() {

                System.out.println("Andando...");
            }
        };
        animal1.walk();
    }
}
