package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassTest01 {
    String name = "Gustavo dev PL";

    public static void main(String[] args) {
        OuterClassTest01 outerClassTest01 = new OuterClassTest01();
        Inner inner = new OuterClassTest01().new Inner();
        Inner inner2 = outerClassTest01.new Inner();
        inner2.printOuterClassAttribute();
    }
    //nested class
    class Inner {
        private String nomeInner = "Gustavo dev JR";
        public void printOuterClassAttribute() {
            System.out.println("Valor do atributo nome da classe externa: " + name);
            System.out.println("Valor do atributo nome da classe interna: " + nomeInner);
            System.out.println("Referenciando a classe externa: " + OuterClassTest01.this);
            System.out.println("Referenciando a classe externa: " + this);
            System.out.println("R");
        }
    }
}
