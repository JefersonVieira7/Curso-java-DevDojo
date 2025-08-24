package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula06EstruturaDeRepeticao004 {
    public static void main(String[] args) {
        double valorCarro = 30000;
        int maxParcelas = 30;

        for(int parcela = 1; parcela <= maxParcelas; parcela++) {
            double valorParcela = valorCarro/parcela;
            if(valorParcela >= 1000){
                System.out.println("Parcela: "+parcela+" Valor: "+valorParcela);
            } else{
                break;
            }
        }
    }
}
