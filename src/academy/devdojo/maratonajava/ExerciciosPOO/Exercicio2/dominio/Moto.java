package academy.devdojo.maratonajava.ExerciciosPOO.Exercicio2.dominio;

public class Moto extends Veiculo implements Manutencao{
    private String tipoGuidao;

    public Moto(String nome, int ano, double valor, String tipoGuidao) {
        super(nome, ano, valor);
        this.tipoGuidao = tipoGuidao;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Informações da Moto.");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Ano: "+this.getAno());
        System.out.printf("Valor: %.2f%n", this.getValor());
        System.out.println("Tipo de Guidão: "+this.tipoGuidao);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção da moto realizada.");
    }

    @Override
    public String toString() {
        return "Moto{" +
                "tipoGuidao='" + tipoGuidao + '\'' +
                '}';
    }
}
