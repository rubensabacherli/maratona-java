package devdojo.maratonajava.javacore.Gassociacao.test;

import devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Santos F.C.");

        //primeiro eu seto o time para o jogador e depois estou imprimindo.
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
