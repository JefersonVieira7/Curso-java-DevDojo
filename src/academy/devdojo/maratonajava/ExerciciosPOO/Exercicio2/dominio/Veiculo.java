package academy.devdojo.maratonajava.ExerciciosPOO.Exercicio2.dominio;

public abstract class Veiculo implements Manutencao{
    private String nome;
    private int ano;
    private double valor;


    public Veiculo(String nome, int ano, double valor) {
        if (ano < 1886) {
            throw new IllegalArgumentException("Ano inválido. O ano deve ser maior ou igual a 1886.");
        }
        if (valor < 0) {
            throw new IllegalArgumentException("Valor inválido. O valor não pode ser negativo.");
        }
        this.nome = nome;
        this.ano = ano;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", valor=" + valor +
                '}';
    }

    public abstract void exibirInformacoes();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
