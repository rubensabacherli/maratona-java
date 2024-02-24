package devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Domerina";
        professor.idade = 80;
        professor.sexo = 'F';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
