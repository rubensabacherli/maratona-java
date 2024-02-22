package devdojo.maratonajava.introducao;

public class EstruturasRepeticao02 {
    public static void main(String[] args) {
        //dado um número de 0 a 50, imprima os primeiros 25 numeros.

        int num = 5;
        for (int i = 0; i < 25; i++) {
            num++;
            System.out.println(num);
        }

        //imprima os primeiros 25 numeros de x valor.

        int valor = 50;
        for (int i = 0; i <= valor; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
