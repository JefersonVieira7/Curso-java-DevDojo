package academy.devdojo.maratonajava.javacore.Hhereanca.dominio;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected Endereco endereco;


    public Endereco getEndereco() {
        return endereco;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.getEndereco().getRua()+" "+ getEndereco().getCep());
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
