package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {

        Aluno aluno = new Aluno(1L, "Gustavo", "123");

        serializar(aluno);
        Aluno alunoDesserializado = (Aluno) desserializar();
        System.out.println(alunoDesserializado);
    }

    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");

        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static Object desserializar(){
        Path path = Paths.get("pasta/aluno.ser");
        Object o = null;
        try (ObjectInputStream oos = new ObjectInputStream(Files.newInputStream(path))) {
            o = oos.readObject();
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return o;
    }
}
