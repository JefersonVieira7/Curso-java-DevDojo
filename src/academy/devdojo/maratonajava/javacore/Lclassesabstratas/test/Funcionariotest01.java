package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class Funcionariotest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Bill gates", 1000000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Jeferson", 25000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
