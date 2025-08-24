package academy.devdojo.maratonajava.javacore.Kenumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "PESSOA FISICA"),
    PESSOA_JURIDICA(2,"PESSOA JURIDICA");

    private int valor;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio){
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }



    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public void setNomeRelatorio(String nomeRelatorio) {
        this.nomeRelatorio = nomeRelatorio;
    }

    public void setVALOR(int VALOR) {
        this.valor = VALOR;
    }

    public int getValor() {
        return valor;
    }
}
