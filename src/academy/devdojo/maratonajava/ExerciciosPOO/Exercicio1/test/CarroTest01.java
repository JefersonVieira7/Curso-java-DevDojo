package academy.devdojo.maratonajava.ExerciciosPOO.Exercicio1.test;

import academy.devdojo.maratonajava.ExerciciosPOO.Exercicio1.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("Honda","Prime", 2025, 200000);
        carro.exibirInformacoes();
    }
}
