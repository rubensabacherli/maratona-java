package devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import devdojo.maratonajava.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Testando");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }
    }
}
