package academy.devdojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class Produtotest01 {
    public static void main(String[] args) {
        Computador computador =  new Computador("Ideapad 3", 3100);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println(">/>/>/>/>/>/>/>/>/>/>/>/>/>/>/>/>/>/>/>/>/>/>/>/");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
