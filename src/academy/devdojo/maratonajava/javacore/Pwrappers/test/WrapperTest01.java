package academy.devdojo.maratonajava.javacore.Pwrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        Byte byteW = 1;
        Integer integerW = 1;
        Character charW= 'W';

        Integer intW = Integer.parseInt("2");
        System.out.println(Character.isLetter(intW));


        // Resolvendo o exercicio 1

        String valor = "1";

        Integer convert = Integer.parseInt(valor);
        System.out.println(convert);
    }
}
