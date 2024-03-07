package devdojo.maratonajava.javacore.Npolimorfismo.test;

import devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import devdojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("fq1298wf", 3231);
        Tomate tomate = new Tomate("Cereja", 12);
        tomate.setDataValidade("15/07/1999");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
