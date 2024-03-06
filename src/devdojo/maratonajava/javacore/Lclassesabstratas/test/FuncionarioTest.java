package devdojo.maratonajava.javacore.Lclassesabstratas.test;

import devdojo.maratonajava.javacore.Lclassesabstratas.domain.Desenvolvedor;
import devdojo.maratonajava.javacore.Lclassesabstratas.domain.Funcionario;
import devdojo.maratonajava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Flavio", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Rubens", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
