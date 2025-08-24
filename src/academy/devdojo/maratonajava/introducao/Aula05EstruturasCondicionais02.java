package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        byte dia = 3;
        switch (dia) {
            case 1, 7 -> System.out.print("Fim de semana");
            case 2, 3, 4, 5,6 -> System.out.print("Dia últil");
            default -> System.out.println("Invalid option!");

        }
    }
}
