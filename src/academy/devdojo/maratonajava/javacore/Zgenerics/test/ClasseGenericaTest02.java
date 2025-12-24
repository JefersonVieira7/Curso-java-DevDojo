package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;


public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService carroRentavelService = new BarcoRentavelService();
        Barco barco = carroRentavelService.buscarBarcoDisponível();
        System.out.println("Usando o barco por um mês...");
        carroRentavelService.retornarBarcoAlugado(barco);

    }
}
