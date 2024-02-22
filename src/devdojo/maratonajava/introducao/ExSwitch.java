package devdojo.maratonajava.introducao;

public class ExSwitch {
    public static void main(String[] args) {
        //Dados os valores de 1 a 7, imprima se é dia util ou final de semana

        byte dia = 1;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
