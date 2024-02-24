package devdojo.maratonajava.introducao;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        //array de array

        int[][] dias = new int[3][3]; //referenciando arrays em cada posição do array inicial
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 30;
        dias[1][1] = 31;
        dias[1][2] = 30;

        dias[2][0] = 31;
        dias[2][1] = 30;
        dias[2][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        for (int[] dia : dias) {
            for (int num : dia) {
                System.out.println(num);
            }
        }
    }
}
