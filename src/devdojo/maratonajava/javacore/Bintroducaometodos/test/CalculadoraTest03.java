package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int num1 = 23;
        int num2 = 523;

        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println(num1);
        System.out.println(num2);

        //os valores foram alterados apenas dentro da função, sem modificar permanentemente.
        //tipos primitivos não são definitivamente alterados, o que é mostrado, é uma cópia.
    }
}
