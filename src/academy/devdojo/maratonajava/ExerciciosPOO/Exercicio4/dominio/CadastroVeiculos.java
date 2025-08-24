package academy.devdojo.maratonajava.ExerciciosPOO.Exercicio4.dominio;

import academy.devdojo.maratonajava.ExerciciosPOO.Exercicio2.dominio.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class CadastroVeiculos {
    List<Veiculo> veiculos = new ArrayList<>();


    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
        System.out.println("Veículo Adicionado: " + veiculo.getNome());
        System.out.println();
    }

    public void removerVeiculo(Veiculo veiculo) {
        if (veiculos.remove(veiculo)) {
            System.out.println("Veículo removido: " + veiculo.getNome());
            System.out.println();
        } else
            System.out.println("Veículo not Found");

    }

    public void listarVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("There's any veiculo on the list!");
            return;
        }
        System.out.println("lista de veículos");
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirInformacoes();
            System.out.println();
        }
    }

    public void atualizarVeiculo(Veiculo veiculoAntigo, Veiculo veiculoNovo) {
        int posicao = veiculos.indexOf(veiculoAntigo);
        if (posicao != -1) {
            veiculos.set(posicao, veiculoNovo);
            System.out.println("Veículo atualizado: " + veiculoNovo.getNome());
        } else {
            System.out.println("Veículo not found");
        }
    }

}
