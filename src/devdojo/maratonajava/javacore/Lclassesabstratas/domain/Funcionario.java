package devdojo.maratonajava.javacore.Lclassesabstratas.domain;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBunos();
    }

    public abstract void calculaBunos();

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
