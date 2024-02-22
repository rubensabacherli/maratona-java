package devdojo.maratonajava.introducao;

public class EstruturasRepeticao {
    public static void main(String[] args) {
        //while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }

        count = 0;
        do {
            System.out.println("Dentro do do-while " + ++count);
        } while (count < 10);

        count = 0;

        //for tem 3 partes,
        //primeira parte é a variável que será incrementada
        //segunda parte é até onde essa variável será contada
        //terceira parte é a incrementação
        for (int i = 0; i < 10; i++) {
            System.out.println("Dentro do for " + i);
        }
    }
}
