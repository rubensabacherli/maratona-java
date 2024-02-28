package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Armando");
        funcionario.setIdade(12);
        funcionario.setSalarios(new double[]{1000, 2000.30, 3000});

        funcionario.imprime();
    }
}
