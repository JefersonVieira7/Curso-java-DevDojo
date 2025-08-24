package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class Ex01 {
    public static void main(String[] args) {
        int resultado = dividir(4, 0);
        System.out.println("Resultado: "+resultado);
    }

    public static int dividir(int valor01, int valor02){
        try {
            return valor01/valor02;

        }catch (ArithmeticException e){
            System.out.println("Não é possível dividir por zero");
            return -1;
        }
    }
}