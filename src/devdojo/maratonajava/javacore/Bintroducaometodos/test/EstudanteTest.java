package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.domain.Estudante;
import devdojo.maratonajava.javacore.Bintroducaometodos.domain.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Rubs";
        estudante1.idade = 24;
        estudante1.sexo = 'M';

        estudante2.nome = "Helo";
        estudante2.idade = 21;
        estudante2.sexo = 'F';

        impressora.imprime(estudante2);
        impressora.imprime(estudante1);

    }
}
