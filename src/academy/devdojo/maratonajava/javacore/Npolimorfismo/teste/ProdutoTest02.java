package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Macbook", 12000);
        System.out.println(produto.getName());
        System.out.println(produto.getValue());
        System.out.println(produto.calcularImposto());
        System.out.println("---------------------");

        Produto produto2 = new Tomate("Tomate siciliano", 10);
        System.out.println(produto2.getName());
        System.out.println(produto2.getValue());
        System.out.println(produto2.calcularImposto());
    }
}
