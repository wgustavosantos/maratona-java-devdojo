package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassTest02 {
    private String nome = "Gustavo";

    void print(){
        class LocalClass {
            public void printLocal(){
                System.out.println(nome);
            }
        }

        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassTest02 t2 = new OuterClassTest02();

        t2.print();
    }
}
