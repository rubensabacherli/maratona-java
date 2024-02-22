package devdojo.maratonajava.introducao;

public class OperadoresLogicos {
    public static void main(String[] args) {

        int idade = 20;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca >
            valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        //atribuição = += -= *= /= %=

        double bonus = 1000; //1000
        bonus += 120; //1120
        bonus -= 120; //880
        bonus *= 2; //2000
        bonus /= 2; //500
        bonus %= 2; //resto
        System.out.println(bonus);

        int contador = 0;
        System.out.println(contador);
        contador += 1;
        System.out.println(contador);
        contador++;
        System.out.println(contador);
        contador--;
        System.out.println(contador);
    }
}