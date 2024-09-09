import java.util.Scanner;

public class Bee1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int litro = 12, tempoGasto, velocidadeMedia;
        double consumoCombustivel;

        tempoGasto = sc.nextInt();
        velocidadeMedia = sc.nextInt();

        consumoCombustivel = (double) (velocidadeMedia * tempoGasto) / litro;

        System.out.printf("%.3f%n", consumoCombustivel);

        sc.close();
    }
}