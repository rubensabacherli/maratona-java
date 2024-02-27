package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Rubs";
        estudante1.idade = 24;
        estudante1.sexo = 'M';

        estudante2.nome = "Helo";
        estudante2.idade = 21;
        estudante2.sexo = 'F';

        estudante2.imprime();
        estudante1.imprime();
    }

}
