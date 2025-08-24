package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.TesteCarro01;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.Domain.Carro;

public class TestCarro01 {
    public static void main(String[] args) {

        Carro carro1 = new Carro("ford", 280, 200);
        Carro carro2 = new Carro("ford", 280, 200);

        Carro.velocidade = 800;

        carro1.imprime();
        carro2.imprime();
    }
}
