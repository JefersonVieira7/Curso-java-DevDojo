package academy.devdojo.maratonajava.javacore.Ycolecoes.exerciciosIndividuais.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.exerciciosIndividuais.dominio.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProdutoTest01 {
    static List<Produto> produtos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            adicionaNaLista();
        }
        listarProdutoOrdenadoPorNome();

    }

    static void adicionaNaLista(){
        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Preço: ");
        Double preco = Double.parseDouble(scanner.nextLine());

        System.out.println("Quantidade: ");
        int quantidade = Integer.parseInt(scanner.nextLine());

        Produto produto = new Produto(nome, preco, quantidade);
        produtos.add(produto);

        System.out.println("Produto adicionado com sucesso");
        System.out.println(produto);
    }

    static void listarProdutoOrdenadoPorNome(){
        Collections.sort(produtos);
        produtos.forEach(System.out::println);
    }

    static void ordenaProPreco(){
        //produtos.sort(new ProdutoO);
    }
}
