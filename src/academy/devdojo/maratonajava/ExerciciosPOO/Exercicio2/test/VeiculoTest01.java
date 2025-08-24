package academy.devdojo.maratonajava.ExerciciosPOO.Exercicio2.test;

import academy.devdojo.maratonajava.ExerciciosPOO.Exercicio2.dominio.Carro;
import academy.devdojo.maratonajava.ExerciciosPOO.Exercicio2.dominio.Moto;

import java.util.LinkedList;
import java.util.List;

public class VeiculoTest01 {
    public static void main(String[] args) {
        Carro carro =  new Carro("Ferrari",2026, 1000000, 4);
        Moto moto = new Moto("CB 1000", 2026, 50000, "Curto");
        carro.exibirInformacoes();
        carro.realizarManutencao();
        System.out.println("----------------");
        moto.exibirInformacoes();
        moto.realizarManutencao();
        List<String> list = new LinkedList<>();
        list.add("Goku");
    }
}