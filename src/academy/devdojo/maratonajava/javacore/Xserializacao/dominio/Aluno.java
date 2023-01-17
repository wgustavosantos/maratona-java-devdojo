package academy.devdojo.maratonajava.javacore.Xserializacao.dominio;

import java.io.*;

public class  Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = 911278911733960853L;
    private Long id;
    private String nome;
    private transient String password;
    private transient Turma turma;//necessário pro jvm nao tentar serializar, pois
    //vamos serializaar manual

    public Aluno(Long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;

    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Serial
    private void writeObject(ObjectOutputStream oos){

        try{
            oos.defaultWriteObject();
            oos.writeUTF(turma.getTurma());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectInputStream ois) {

        try {
            ois.defaultReadObject();
            turma = new Turma(ois.readUTF());


        } catch (ClassNotFoundException | IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", turma=" + turma.getTurma() +
                '}';
    }
}
