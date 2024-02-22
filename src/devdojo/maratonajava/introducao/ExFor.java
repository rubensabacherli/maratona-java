package devdojo.maratonajava.introducao;

public class ExFor {
    public static void main(String[] args) {
        //imprimir todos os numeros pares, zero e um.

        for (int i = 1; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
