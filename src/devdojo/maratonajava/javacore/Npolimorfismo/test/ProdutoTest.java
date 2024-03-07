package devdojo.maratonajava.javacore.Npolimorfismo.test;

import devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import devdojo.maratonajava.javacore.Npolimorfismo.domain.Televisao;
import devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import devdojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("120387af", 2312);
        Tomate tomate = new Tomate("Italia", 10);
        Televisao tv = new Televisao("SAMSUNG 50\" ", 1850);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}