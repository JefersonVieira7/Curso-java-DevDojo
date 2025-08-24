package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerarquivo();
    }

    public static void lerarquivo() {
        try (Reader reader = new BufferedReader(new FileReader("Teste.txt"))){

        }catch (IOException e){

        }
    }
}