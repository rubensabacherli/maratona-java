package devdojo.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {

    private double salario;

    static {
        System.out.println("Bloco estático Funcionario");
    }

    {
        System.out.println("Bloco de inicialização Funcionario 1");
    }

    {
        System.out.println("Bloco de inicialização Funcionario 2");

    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Construtor Funcionario");
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
