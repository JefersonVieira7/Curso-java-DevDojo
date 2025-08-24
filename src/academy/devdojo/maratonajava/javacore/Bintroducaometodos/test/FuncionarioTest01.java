package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();;
        funcionario.setNome("Jeferson");
        funcionario.setIdade(18);
        funcionario.setSalarios(new double[]{2000, 5000, 10000});

        //funcionario.salarios = new double[]{2000, 5000, 10000};

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getIdade());
        System.out.println(funcionario.getSalarios());



        funcionario.imprime();
        funcionario.imprimeMediaSalarios();

    }
}