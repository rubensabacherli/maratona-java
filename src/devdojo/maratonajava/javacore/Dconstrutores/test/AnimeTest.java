package devdojo.maratonajava.javacore.Dconstrutores.test;

import devdojo.maratonajava.javacore.Dconstrutores.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("DBZ", "mangá", "ação", 23, "IG");
        anime.imprime();
    }
}
