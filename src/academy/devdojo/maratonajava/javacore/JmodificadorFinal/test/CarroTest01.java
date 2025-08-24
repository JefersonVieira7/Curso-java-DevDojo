package academy.devdojo.maratonajava.javacore.JmodificadorFinal.test;

import academy.devdojo.maratonajava.javacore.JmodificadorFinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.JmodificadorFinal.dominio.Comprador;
import academy.devdojo.maratonajava.javacore.JmodificadorFinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setName("Civic 2025");


        carro.COMPRADOR.setNome("Jeferson");
        System.out.println("Comprador: "+carro.COMPRADOR);
        System.out.println("Carro: "+carro.getName());
        System.out.println("Velocidade Limite: "+Carro.VELOCIDADE_LIMITE);
        Ferrari ferrari = new Ferrari();
        ferrari.setName("New Ferrari");
        ferrari.imprime();

    }
}
