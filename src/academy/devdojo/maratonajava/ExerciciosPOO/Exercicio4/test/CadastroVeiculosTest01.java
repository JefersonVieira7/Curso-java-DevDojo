package academy.devdojo.maratonajava.ExerciciosPOO.Exercicio4.test;

import academy.devdojo.maratonajava.ExerciciosPOO.Exercicio2.dominio.Carro;
import academy.devdojo.maratonajava.ExerciciosPOO.Exercicio2.dominio.Moto;
import academy.devdojo.maratonajava.ExerciciosPOO.Exercicio4.dominio.CadastroVeiculos;

public class CadastroVeiculosTest01 {
    public static void main(String[] args) {
        CadastroVeiculos cadastroVeiculos = new CadastroVeiculos();
        Carro carro = new Carro("Porshe", 2026, 2000000, 4);
        Moto moto = new Moto("CB1000", 2026, 50000, "Reto");

        cadastroVeiculos.adicionarVeiculo(moto);
        cadastroVeiculos.adicionarVeiculo(carro);
        cadastroVeiculos.listarVeiculos();

        cadastroVeiculos.atualizarVeiculo(moto, carro);


        cadastroVeiculos.listarVeiculos();
    }
}
