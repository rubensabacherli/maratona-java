package devdojo.maratonajava.javacore.Gassociacao.test;

import devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Domerina");
        Professor professor2 = new Professor("Katia");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Leonor", professores);

        escola.imprime();
    }
}
