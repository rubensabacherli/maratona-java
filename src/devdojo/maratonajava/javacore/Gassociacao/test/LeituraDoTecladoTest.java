package devdojo.maratonajava.javacore.Gassociacao.test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeituraDoTecladoTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo: ");
        String nome = input.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.println("Qual seu sexo? M - Masculino / F - Feminino");
        char sexo = input.next().charAt(0);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }
}
