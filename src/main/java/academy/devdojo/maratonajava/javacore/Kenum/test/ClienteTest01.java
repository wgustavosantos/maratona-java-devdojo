package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gustavo", TipoCliente.PESSOA_JURIDICA);
        cliente.setTipoPagamento(TipoPagamento.CREDITO);

        System.out.println(cliente.getTipoPagamento().calcularDesconto(100));
        System.out.println(cliente.getTipoCliente().tipoClientePorNomeRelatorio("Pessoa Física"));
    }
}
