import java.util.Scanner;


public class Bee1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, maiorPrimeiro,maiorTotal;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        maiorPrimeiro = (a + b + Math.abs(a-b)) / 2;
        maiorTotal = (maiorPrimeiro + c + Math.abs(maiorPrimeiro - c)) / 2;

        System.out.printf("%d eh o maior%n", maiorTotal);

        sc.close();
    }
}
