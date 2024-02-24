package devdojo.maratonajava.introducao;

public class Arrays02 {
    public static void main(String[] args) {

        //inicializações padrão do array
        //byte, short, int, long, float e double -> 0
        //char -> '/u0000 ' ' '
        //boolean -> false
        //String -> null

        String[] nomes = new String[3];

        nomes[0] = "Rubens";
        nomes[1] = "Abacherli";
        nomes[2] = "Neto";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
