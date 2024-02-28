package devdojo.maratonajava.javacore.Csobrecargametodos.test;

import devdojo.maratonajava.javacore.Csobrecargametodos.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Jujutsu", "TV", "Comédia", 230);
        anime.imprime();
    }
}
