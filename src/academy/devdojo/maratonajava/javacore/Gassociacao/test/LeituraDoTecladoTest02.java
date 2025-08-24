package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("O GRANDE SOFTWARE DE PREVISÃO DO FUTURO");
        System.out.print("DIGITE SUA PERGUNTA E EU RESPONDEREI SIM OU NÃO: ");
        String pergunta = input.nextLine();

        if (pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else {
            System.out.println("NÃO");
        }
    }
}
