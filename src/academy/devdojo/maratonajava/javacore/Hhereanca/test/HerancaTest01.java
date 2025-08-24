package academy.devdojo.maratonajava.javacore.Hhereanca.test;

import academy.devdojo.maratonajava.javacore.Hhereanca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hhereanca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hhereanca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep(41611640);
        endereco.setRua("Rua Bahia de Itapuã");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jeferson");
        pessoa.setIdade(18);
        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Estefany");
        funcionario.setIdade(25);
        funcionario.setEndereco(endereco);
        funcionario.setSalario(400);
        pessoa.imprime();
        System.out.println(">>>>>>>>>>>>>>>>>>");
        funcionario.imprime();

    }
}
