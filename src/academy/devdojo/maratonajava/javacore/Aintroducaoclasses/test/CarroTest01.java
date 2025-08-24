package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Eco-Sport";
        carro01.modelo = "Titanium";
        carro01.ano = 2012;

        carro02.nome = "Ranger";
        carro02.modelo = "XLS 2.0 4x4";
        carro02.ano = 2025;

        System.out.println("Nome: " + carro02.nome + " Modelo: " + carro02.modelo + " Ano: " + carro02.ano);
        System.out.println("Nome: " + carro01.nome + " Modelo: " + carro01.modelo + " Ano: " + carro01.ano);
    }
}

