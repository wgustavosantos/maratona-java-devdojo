package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.sql.SQLOutput;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        //precisa ser um comparable
        Queue<String> fila = new PriorityQueue<>();

        fila.add("D");
        fila.add("A");
        fila.add("B");
        fila.add("C");
        fila.add("F");
        fila.add("E");

        for (String s : fila) {
            System.out.println(s);
        }

        System.out.println("*-------------*");

        //fila.peek retorna o primeiro elemento e so
        //
        while(!fila.isEmpty()){
            System.out.println(fila.poll());
        }
        if(fila.isEmpty()){
            System.out.println("fila vazia depois de chamar poll");
        }
    }
}
