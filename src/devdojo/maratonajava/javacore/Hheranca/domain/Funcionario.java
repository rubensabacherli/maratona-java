package devdojo.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome) {
        super(nome);
    }

    //sobrescrevendo a função imprime que vem da classe pessoa
    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
