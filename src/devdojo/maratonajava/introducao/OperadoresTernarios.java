package devdojo.maratonajava.introducao;

public class OperadoresTernarios {
    public static void main(String[] args) {
        double salario = 5001;
        //String resultado = (condicao) ? verdadeiro : falso;
        String resultado = salario > 5000 ? "Não pode" : "Pode doar";

        System.out.println(resultado);
    }
}
