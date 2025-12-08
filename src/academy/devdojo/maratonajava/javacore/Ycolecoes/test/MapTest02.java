package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MapTest02 {
    public static void main(String[] args) {
        HashSet<Consumidor> consumidores = new HashSet<>();
        Consumidor consumidor1 = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("Jeferson");
        consumidores.add(consumidor1);
        consumidores.add(consumidor2);
        for (Consumidor consumidor : consumidores){
            System.out.println(consumidor);
        }
    }
}
