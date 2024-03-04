package devdojo.maratonajava.javacore.Gassociacao.test;

import devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua Estado de Pernambuco, 489");
        Aluno aluno = new Aluno("Rubs Bacherle", 24);
        Professor professor = new Professor("Agnaldo Batista", "Umecologo");
        Aluno[] alunoSeminario = {aluno};

        Seminario seminario = new Seminario("Formigas", alunoSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
