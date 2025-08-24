package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Time {
    private String nome;
    private String idade;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time() {
        System.out.println("Esse é execultado primeiro");
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
