package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Gustavo");
        Professor professor2 = new Professor("Taylor");
        Escola escola = new Escola("Konoha");
        escola.setProfessores(new Professor[]{professor, professor2});

        escola.imprime();

    }
}
