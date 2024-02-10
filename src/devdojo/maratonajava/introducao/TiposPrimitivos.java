package devdojo.maratonajava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long boolean
        //Classes, a primeira letra é sempre maiuscula, em variáveis, sempre minusculda
        int  age = 10;
        long numeroGrande = 1000000L;
        double salarioDouble = 2000D;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = false;
        char caractere = 'M';

        //dependendo dos tamanhos, podemos ajustar os tipos

        //toda vez que escrevemos inteiros, ele vai tratar como inteiros
        float salarioFloat = 2500.0F;

        //a conversão é importante para que o sistema utilize o tipo correto
        int num = (int)10000000000L;

        //String não é valor primitivo -> Reference type
        String nome = "Rubens";

        System.out.println("A idade é " + age);
        System.out.println(verdadeiro);
        System.out.println("char " + caractere);
        System.out.println(numeroGrande);
        System.out.println(num);
        System.out.println("meu nome é " + nome);
    }
}