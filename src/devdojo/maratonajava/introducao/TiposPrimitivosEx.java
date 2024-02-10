package devdojo.maratonajava.introducao;

/*
* Prática
*
* Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
*
* eu <nome>, morando no endereço <endereco>,
* confirmo que recebi o salário <salario>, nada data <data>
* */
public class TiposPrimitivosEx {
    public static void main(String[] args) {
        String  nome = "Rubens";
        String endereco = "Rua Estado de Pernambuco, 489";
        double salario = 2400D;
        String data = "01/02/2022";

        System.out.println("Eu " + nome + ", morando no endereço " +
                endereco + "confirmo que recebi o salário" + salario +
                ", nada data " + data);
    }

}
