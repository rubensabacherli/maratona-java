package devdojo.maratonajava.javacore.Kenum.test;

import devdojo.maratonajava.javacore.Kenum.domain.Cliente;
import devdojo.maratonajava.javacore.Kenum.domain.TipoCliente;
import devdojo.maratonajava.javacore.Kenum.domain.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("flavio", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("flavio", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);


        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = tipoCliente.customerTypeByReport("Pessoa Fisica");
        System.out.println(tipoCliente2);
    }
}
