package devdojo.maratonajava.javacore.Hheranca.test;

import devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Estado de Pernambuco");
        endereco.setCep("13-424.223");

        Pessoa pessoa = new Pessoa("Rubs Bacherle");
        pessoa.setCpf("4248109485");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Helo Santos");
        funcionario.setCpf("120328412");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(23494);

        System.out.println("--------------");

        funcionario.imprime();
    }
}
