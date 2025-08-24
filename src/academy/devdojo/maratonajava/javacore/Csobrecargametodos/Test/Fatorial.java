package academy.devdojo.maratonajava.javacore.Csobrecargametodos.Test;

public class Fatorial {

    public void entregaFatorial(int valor){
        int resultado = 1;
        for (int i = 2; i <= valor; i++) {
            resultado *= i;
        }
        System.out.println(resultado);
    }
    public static void main(String[] args) {
        Fatorial fatorial = new Fatorial();
        fatorial.entregaFatorial(4);
    }
}
