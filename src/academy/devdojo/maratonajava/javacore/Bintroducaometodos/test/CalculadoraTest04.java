package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora04 = new Calculadora();

        int a = 5;
        int b = 6;
        calculadora04.alteraDoisNumeros(a, b);
        System.out.println(a);
        System.out.println(b);

    }
}
