package academy.devdojo.maratonajava.javacore.Csobrecargametodos.Dominio;

public class Anime {
    private String nome;
    private int episodios;
    private String genero;



    public void init(String nome, int episodios){
        this.nome = nome;
        this.episodios = episodios;
        this.genero = genero;
    }

    public void init(String nome, int episodios, String genero){
        this.init(nome, episodios);
        this.genero = genero;
    }

    public void imprimi() {
        System.out.println(this.nome);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

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
