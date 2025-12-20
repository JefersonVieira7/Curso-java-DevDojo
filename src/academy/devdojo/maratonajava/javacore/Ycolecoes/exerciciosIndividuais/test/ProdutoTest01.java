package academy.devdojo.maratonajava.javacore.Ycolecoes.exerciciosIndividuais.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.exerciciosIndividuais.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Ycolecoes.exerciciosIndividuais.dominio.ProdutoPorPrecoComparator;

import java.util.*;

public class ProdutoTest01 {
    static List<Produto> produtos = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            adicionaNaLista();
        }
        listarProdutoOrdenadoPorNome();
        ordenarPorPreco();

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

        System.out.println("-------------------------------------------");
    }

    static void listarProdutoOrdenadoPorNome(){
        Collections.sort(produtos);
        produtos.forEach(System.out::println);
    }

    private static void ordenarPorPreco() {
        produtos.sort(new ProdutoPorPrecoComparator());
        produtos.forEach(System.out::println);
    }

    private static void buscarProduto(){
        Collections.sort(produtos);
        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();
    }

    private static void removerProduto(){
        System.out.println("Nome do produto a ser removido: ");
        String nome = scanner.nextLine();

        Iterator<Produto> iterator = produtos.iterator();
        boolean removido = false;

        while (iterator.hasNext()){
            Produto produto = iterator.next();
            if (produto.getNome().equalsIgnoreCase(nome)){
                iterator.remove();
                removido = true;
                System.out.println("Produto removido com sucesso!");
                break;
            }
            if (!removido){
                System.out.println("Produto não encontrado.");
            }
        }
    }

}
