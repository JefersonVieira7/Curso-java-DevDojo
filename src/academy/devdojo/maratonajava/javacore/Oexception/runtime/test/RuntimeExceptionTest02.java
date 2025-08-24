package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
      int resultado = divideInteiros(2, 0);
        System.out.println(resultado);
    }

    public  static int divideInteiros(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Não é possível dividir por zero!");
        }
        return a/b;
    }
}