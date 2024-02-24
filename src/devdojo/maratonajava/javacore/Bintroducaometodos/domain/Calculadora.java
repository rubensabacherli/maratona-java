package devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculadora {
    //metodo é uma ação

    public void soma() {
        System.out.println(10 + 10);
    }

    public void subtracao() {
        System.out.println(21 - 2);
    }

    public void multiplicacao(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public int divisao(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return (int) (num1 / num2);
    }
}
