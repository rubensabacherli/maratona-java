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

    public double divisao(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro dessa func ");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int i : numeros) {
            soma += i;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int i : numeros) {
            soma += i;
        }
        System.out.println(soma);
    }
}
