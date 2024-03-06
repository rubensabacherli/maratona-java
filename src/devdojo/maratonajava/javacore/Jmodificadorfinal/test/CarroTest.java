package devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Carro;
import devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Ferrari;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Flavio");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("F40");
        ferrari.imprime();
    }
}
