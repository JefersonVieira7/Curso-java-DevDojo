package academy.devdojo.maratonajava.javacore.Dconstrutores.Dominio;

public class Anime {
    private String nome;
    private int episodios;
    private String genero;
    private String cor;

    public Anime(String nome, int episodios, String genero){
        this();
        this.nome = nome;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, int episodios, String genero, String cor){
        this(nome, episodios, genero);
        this.cor = cor;
    }

    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprimi() {
        System.out.println(this.nome);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.cor);

    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){return nome;}

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
