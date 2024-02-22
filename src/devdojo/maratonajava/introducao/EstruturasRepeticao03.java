package devdojo.maratonajava.introducao;

public class EstruturasRepeticao03 {

    // Dado o valor de um carro, descubra em quantas ele pode ser parcelado
    // Condição valorParceIa 1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
