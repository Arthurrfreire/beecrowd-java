import java.util.Scanner;

public class Bee1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        double b, consumoMedio;

        a = sc.nextInt();
        b = sc.nextDouble();

        consumoMedio = a / b;

        System.out.printf("%.3f km/l%n", consumoMedio);

        sc.close();
    }
}