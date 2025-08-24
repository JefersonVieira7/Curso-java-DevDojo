package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

import java.time.Instant;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Macbook", 12000);

        System.out.println("---------------------");

        Tomate tomate = new Tomate("Tomate siciliano", 10);
        tomate.setDataValidade("03/04/2026");

        CalculadoraImposto.calcularImposto(tomate);
    }
}
