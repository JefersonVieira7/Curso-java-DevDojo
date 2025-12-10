package academy.devdojo.maratonajava.javacore.Ycolecoes.exerciciosIndividuais;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VerificaPalavraExistente {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("python", "java", "c#", "javascript"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um linguagem de programação");
        String nome = scanner.nextLine();

        if (names.contains(nome)){
            System.out.println("Já existe essa linguagem dentro da lista");
        }else {
            System.out.println("Não existe essa linguagem dentro da lista");
        }

    }
}


