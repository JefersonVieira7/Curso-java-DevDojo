package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0){
            return num1/num2;
        }
        return 0;
    }

    public void alteraDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println(numero1);
        System.out.println(numero2);
    }
}