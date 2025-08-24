package academy.devdojo.maratonajava.javacore.Minterface.test;

import academy.devdojo.maratonajava.javacore.Minterface.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterface.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterface.dominio.FileLoader;

public class InterfaceTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        databaseLoader.checkPermission();
        fileLoader.load();
        fileLoader.checkPermission();

    }
}
