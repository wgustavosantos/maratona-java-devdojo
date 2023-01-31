package academy.devdojo.maratonajava.javacore.ZZClambdas.exelambdas;

@FunctionalInterface
interface Square {
    public int square (int x);
}
public class LambdasTest02 {
    public static void main(String[] args) {

        //sintaxe 1
        Square s = new Square(){
            @Override
            public int square(int x) {
                return x * x;
            }
        };

//        Square s8 = new Square(
//                (x) -> x
//        );

        //sintaxe 2
        Square s2 = (int x) ->{
            int z = x*x;
            return z;
        };
        //sintaxe 3
        Square s3 = (int x) ->{
            return x*x;
        };
        //sintaxe 4
        Square s4 = (int x) ->{ return x*x;};
        //sintaxe 5
        Square s5 = (x) -> {return x*x;};
        //sintaxe 6
        Square s6 = x -> x*x;
    }
}
