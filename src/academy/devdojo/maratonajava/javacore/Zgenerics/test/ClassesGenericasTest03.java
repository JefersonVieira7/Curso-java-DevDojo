package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClassesGenericasTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponíveis = new ArrayList<>(
                List.of(new Carro("Bmw"), new Carro("Porshe")));
        List<Barco> BarcosDisponíveis = new ArrayList<>(
                List.of(new Barco("Lancha"), new Barco("Canoa")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponíveis);
        Carro carro = rentalService.buscarObjetoDisponível();
        System.out.println("Usando o carro por um mês......");
        rentalService.retornarCarroAlugado(carro);

    }
}
