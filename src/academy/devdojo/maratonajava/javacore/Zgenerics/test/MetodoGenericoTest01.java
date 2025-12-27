package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.Domain.Carro;
import academy.devdojo.maratonajava.javacore.ZZEstream.test.Pessoa;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        new DoisAtributos<Carro, Pessoa, Barco>();
    }
    static class DoisAtributos <T,X, I>{
        private T t;
        private X x;
        private I i;
    }
}
