package devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        System.out.println("Digite uma pergunta e eu te darei a previsão do futuro!");

        Scanner input = new Scanner(System.in);

        String pergunta = input.nextLine();

        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
    }
}
