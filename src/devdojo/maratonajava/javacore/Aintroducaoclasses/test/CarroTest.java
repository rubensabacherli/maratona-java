package devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Corolla";
        carro1.ano = 2019;
        carro1.modelo = "Toyota Corolla";

        carro2.nome = "Uno";
        carro2.ano = 2000;
        carro2.modelo = "FIAT Uno";

        System.out.println("Carro 1: ");
        System.out.println(carro1.modelo);
        System.out.println(carro1.nome);
        System.out.println(carro1.ano);

        System.out.println("--------------");

        System.out.println("Carro 2: ");
        System.out.println(carro2.modelo);
        System.out.println(carro2.nome);
        System.out.println(carro2.ano);
    }
}