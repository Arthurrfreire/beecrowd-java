import java.util.Scanner;

public class Bee1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, x= 60, y=90, velocidadeRelativa, convertendo, tempo;

        a = sc.nextInt();

        velocidadeRelativa = y - x;
        convertendo = velocidadeRelativa / 60;
        tempo = 2 * a;

        System.out.printf("%d minutos%n", tempo);

        sc.close();
    }
}