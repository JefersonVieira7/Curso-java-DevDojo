package academy.devdojo.maratonajava.javacore.Oexception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Leitor2;

import java.io.IOException;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerarquivo();
    }

    public static void lerarquivo() {
        try (Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){
            System.out.println("Erro");
        }
    }
}