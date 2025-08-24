package academy.devdojo.maratonajava.javacore.Minterface.dominio;

public interface DataLoader {
    public abstract void load();
    public default void checkPermission(){
        System.out.println("Fazendo Chegem de permisão");
    }
}
