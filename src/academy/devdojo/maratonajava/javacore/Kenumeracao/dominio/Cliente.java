package academy.devdojo.maratonajava.javacore.Kenumeracao.dominio;

public class Cliente {


    private String name;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String name, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.name = name;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteString=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteint=" + tipoCliente.getValor() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}