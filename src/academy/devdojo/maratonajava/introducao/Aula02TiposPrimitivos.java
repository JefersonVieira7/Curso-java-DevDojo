package academy.devdojo.maratonajava.introducao;
import java.util. Scanner;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.next();
        char primeiraLetra = palavra.charAt(0);
        char ultimaLetra = palavra.charAt(palavra.length()-1);
        int tamanhoTotal = palavra.length();
        System.out.println("Primeira letra: "+ palavra);
        System.out.println("Última letra: "+ ultimaLetra);
        System.out.print("Total de letras: "+ tamanhoTotal);


    }
}
