package devdojo.maratonajava.introducao;

public class ExBreak {
    //dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
    //condicao valorParcela >= 1000
    public static void main(String[] args) {

        double valCarro = 45000;

        for (int parcela = 0; parcela <= valCarro; parcela++) {
            double valorParcela = valCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }

    }
}
