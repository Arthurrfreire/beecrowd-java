import java.util.Scanner;

public class Bee1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorMinimo, valorOriginal, notas100, notas50, notas20, notas10, notas5, notas2, notas1;


        valorMinimo = sc.nextInt();
        valorOriginal = valorMinimo;

        notas100 = valorMinimo / 100;
        valorMinimo %= 100;
        notas50 = valorMinimo / 50;
        valorMinimo %= 50;
        notas20 = valorMinimo / 20;
        valorMinimo %= 20;
        notas10 = valorMinimo / 10;
        valorMinimo %= 10;
        notas5 = valorMinimo / 5;
        valorMinimo %= 5;
        notas2 = valorMinimo / 2;
        valorMinimo %= 2;
        notas1 = valorMinimo / 1;

        System.out.printf("%d%n", valorOriginal);
        System.out.printf("%d nota(s) de R$ 100,00%n", notas100);
        System.out.printf("%d nota(s) de R$ 50,00%n", notas50);
        System.out.printf("%d nota(s) de R$ 20,00%n", notas20);
        System.out.printf("%d nota(s) de R$ 10,00%n", notas10);
        System.out.printf("%d nota(s) de R$ 5,00%n", notas5);
        System.out.printf("%d nota(s) de R$ 2,00%n", notas2);
        System.out.printf("%d nota(s) de R$ 1,00%n", notas1);

        sc.close();
    }
}