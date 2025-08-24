package academy.devdojo.maratonajava.ExerciciosPOO.Exercicio1.dominio;

public class Carro {
    private String marca;
    private String modelo;
    private  int ano;
    private double preco;

    public Carro(String marca, String modelo, int ano, double preco) {
        if (ano < 1886) {
            throw new IllegalArgumentException("Ano inválido. O ano deve ser maior ou igual a 1886.");
        }
        if (preco < 0) {
            throw new IllegalArgumentException("Preço inválido. O preço não pode ser negativo.");
        }
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", preco=" + preco +
                '}';
    }

    public void exibirInformacoes(){
        System.out.println("Marca: "+this.getMarca());
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Ano: "+this.getAno());
        System.out.printf("Preço: %.2f%n", this.getPreco());
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
