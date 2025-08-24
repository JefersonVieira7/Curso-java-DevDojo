package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class exceptionTest01 {
    public static void main(String[] args) {
        criarNovoAquivo();
    }

    private static void criarNovoAquivo(){
        File file = new File("arquivo\\test.txt");
        try {
            boolean iscriado = file.createNewFile();
            System.out.println("arquivo criado "+iscriado);

        }catch (IOException e){
            System.out.println("Erro ao tentar criar arquivo");
        }
    }
}
