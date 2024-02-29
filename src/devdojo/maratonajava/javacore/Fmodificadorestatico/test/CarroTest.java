package devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180); //qualquer coisa feita num objeto statico, altera todas as outras instancias.

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}