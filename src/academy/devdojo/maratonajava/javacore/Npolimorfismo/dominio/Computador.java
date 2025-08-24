package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Computador extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.21;
    public Computador(String name, double value) {
        super(name, value);
    }



    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador que custa "+value);
        return this.value * IMPOSTO_POR_CENTO;
    }
}