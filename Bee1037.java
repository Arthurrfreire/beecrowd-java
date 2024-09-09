import java.util.Scanner;

public class Bee1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorQualquer;
        valorQualquer = sc.nextDouble();

        if (valorQualquer >= 0 && valorQualquer <= 25.0000) {
            System.out.println("Intervalo [0,25]");
        }else if (valorQualquer >= 25.00001 && valorQualquer <= 50.0000000) {
            System.out.println("Intervalo (25,50]");
        }else if (valorQualquer >= 50.0000001 && valorQualquer <= 75.0000000) {
            System.out.println("Intervalo (50,75]");
        }else if (valorQualquer >= 75.0000001 && valorQualquer <= 100.0000000) {
            System.out.println("Intervalo (75,100]");
        }else {
            System.out.println("Fora de intervalo");
        }

        sc.close();
    }
}