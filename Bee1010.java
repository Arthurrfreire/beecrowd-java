import java.util.Scanner;

public class Bee1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, d, e;
        double c, f, valorPeca1, valorPeca2, valorTotal;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextDouble();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextDouble();

        valorPeca1 = b * c;
        valorPeca2 = e * f;

        valorTotal = valorPeca1 + valorPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
    }
}