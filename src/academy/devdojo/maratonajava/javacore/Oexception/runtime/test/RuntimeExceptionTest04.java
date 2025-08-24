package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;


public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        }catch (NumberFormatException e){
            System.out.println("Dentro do NuberFormatException");
        }
        catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }
    }
}