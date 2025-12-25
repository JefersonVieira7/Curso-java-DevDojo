package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.List;

public class RentalService <T>{
    private List<T> objetosDisponiveis;
    public RentalService(List<T> objetosDisponíveis) {
        this.objetosDisponiveis = objetosDisponíveis;
    }

    public T buscarObjetoDisponível(){
        System.out.println("Buscando objeto disponível....");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto: "+ t);
        System.out.println("Objetos disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
        return t;

    }

    public void retornarCarroAlugado(T t){
        System.out.println("Devolvendo carro: "+t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }
}
