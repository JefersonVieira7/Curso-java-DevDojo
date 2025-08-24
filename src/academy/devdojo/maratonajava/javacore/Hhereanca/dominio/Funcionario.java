package academy.devdojo.maratonajava.javacore.Hhereanca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println(this.nome+" "+ this.idade);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
