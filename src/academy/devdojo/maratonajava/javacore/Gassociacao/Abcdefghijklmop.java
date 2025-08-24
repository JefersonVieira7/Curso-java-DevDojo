package academy.devdojo.maratonajava.javacore.Gassociacao;

public class Abcdefghijklmop {
    public static void main(String[] args) {
        int valor = 7;
        imprimeTabuada(valor);
    }

    public static void imprimeTabuada(int numero){
        for (int i = 1; i <= 10 ; i++) {
            int resultado = numero * i;
            System.out.println(numero+"x"+i +" = "+ resultado);
        }
    }
}
