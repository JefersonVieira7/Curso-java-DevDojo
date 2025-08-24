package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class Pessoatest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("tanjiro");
        pessoa.setIdade(16);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
