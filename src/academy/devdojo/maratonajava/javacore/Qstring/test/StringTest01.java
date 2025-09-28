package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Jefinho";
        String nome2 = "Jefinho";
        nome = nome.concat(" Dev");
        System.out.println(nome);
        System.out.println(nome == nome2);

    }
}
