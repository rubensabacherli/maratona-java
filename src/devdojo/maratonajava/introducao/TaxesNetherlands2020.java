package devdojo.maratonajava.introducao;

public class TaxesNetherlands2020 {
    public static void main(String[] args) {
        double salarioAnual = 68507;
        double tax = 49.50;

        if (salarioAnual >= 34713 && salarioAnual <= 68507){
            tax = 37.35;
        } else if (salarioAnual <= 34712){
            tax = 9.7;
        }
        System.out.printf("Seu salário é " + salarioAnual + " a taxa é " + tax + " o valor a ser pago é" +
                ((salarioAnual * tax) / 100));
    }
}