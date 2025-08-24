package academy.devdojo.maratonajava.javacore.Kenumeracao.Test;

import academy.devdojo.maratonajava.javacore.Kenumeracao.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenumeracao.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenumeracao.dominio.TipoPagamento;


public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jeferson", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("JefersonDev", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO );

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));


    }
}
