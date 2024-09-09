import java.util.Scanner;

public class Bee1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorMinimo, notas100, notas50, notas20, notas10, notas5, notas2;
        double centavos, moedas1, moedas50, moedas25, moedas10, moedas5, moedas01;


        valorMinimo = sc.nextDouble();

        notas100 = valorMinimo / 100;
        valorMinimo %= 100;
        notas50 = (int) valorMinimo / 50;
        valorMinimo %= 50;
        notas20 = (int) valorMinimo / 20;
        valorMinimo %= 20;
        notas10 = (int) valorMinimo / 10;
        valorMinimo %= 10;
        notas5 = (int) valorMinimo / 5;
        valorMinimo %= 5;
        notas2 = (int) valorMinimo / 2;
        valorMinimo %= 2;


        centavos = valorMinimo * 100;
        moedas1 = (int) centavos / 100;
        centavos %= 100;
        moedas50 = (int) centavos / 50;
        centavos %= 50;
        moedas25 = (int) centavos / 25;
        centavos %= 25;
        moedas10 = (int) centavos / 10;
        centavos %= 10;
        moedas5 = (int) centavos / 5;
        centavos %= 5;
        moedas01 = (int) centavos / 1;

        System.out.printf("NOTAS:%n");
        System.out.printf("%d nota(s) de R$ 100.00%n", (int) notas100);
        System.out.printf("%d nota(s) de R$ 50.00%n", (int) notas50);
        System.out.printf("%d nota(s) de R$ 20.00%n", (int) notas20);
        System.out.printf("%d nota(s) de R$ 10.00%n", (int) notas10);
        System.out.printf("%d nota(s) de R$ 5.00%n", (int) notas5);
        System.out.printf("%d nota(s) de R$ 2.00%n", (int) notas2);
        System.out.printf("MOEDAS:%n");
        System.out.printf("%d moeda(s) de R$ 1.00%n", (int) moedas1);
        System.out.printf("%d moeda(s) de R$ 0.50%n", (int) moedas50);
        System.out.printf("%d moeda(s) de R$ 0.25%n", (int) moedas25);
        System.out.printf("%d moeda(s) de R$ 0.10%n", (int) moedas10);
        System.out.printf("%d moeda(s) de R$ 0.05%n", (int) moedas5);
        System.out.printf("%d moeda(s) de R$ 0.01%n", (int) moedas01);

        sc.close();
    }
}