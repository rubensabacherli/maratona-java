package devdojo.maratonajava.introducao;

public class Arrays {
    public static void main(String[] args) {

        int[] idades = new int[3];
        idades[0] = 15;
        idades[1] = 20;
        idades[2] = 25;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

        for (int i = 0; i <= 2; i++) {
            System.out.println(idades[i]);
        }
    }
}
