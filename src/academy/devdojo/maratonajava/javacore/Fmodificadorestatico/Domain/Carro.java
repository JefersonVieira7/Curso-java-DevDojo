package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.Domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private double velocidadeLimite;
    public static double velocidade = 100;

    public Carro(String nome, double velocidadeMaxima, double velocidadeLimite) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeLimite = velocidadeLimite;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.velocidadeMaxima);
        System.out.println(this.velocidadeLimite);
        System.out.println(Carro.velocidade);
        System.out.println(">>>>>>>>>>>>>>>>>>>");
    }

    public String getNome() {
        return nome ;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}

