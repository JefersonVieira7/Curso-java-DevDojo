package academy.devdojo.maratonajava.introducao;
import java.util. Scanner;

public class Aula06EstruturaDeRepeticao005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 5: ");
        int number = scanner.nextInt();
        String resposta = "";
        if(number>0 && number<=5){
            resposta = "Correto";
        }else{
            resposta = "Erro!. Digite um número entre 1 e 5";
        }
        System.out.println(resposta);
    }
}