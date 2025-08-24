package academy.devdojo.maratonajava.ExerciciosPOO.Exercicio2.dominio;

public class Carro extends Veiculo implements Manutencao{
    private int numeroPortas;

    public Carro(String nome, int ano, double valor, int numeroPortas) {
        super(nome, ano, valor);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Informações do Carro.");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Ano: "+this.getAno());
        System.out.printf("Valor: %.2f%n", this.getValor());
        System.out.println("Número de Portas: "+this.numeroPortas);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção do carro realizado.");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "numeroPortas=" + numeroPortas +
                '}';
    }
}
