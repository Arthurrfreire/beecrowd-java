import java.util.Scanner;

public class Bee1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, raizesEquacao, raizesPositiva, raizesNegativa;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        raizesEquacao = (b * b) - (4 * a * c);

        if (a == 0 || raizesEquacao < 0) {
            System.out.println("Impossivel calcular");
        } else {
            raizesPositiva = (-b + Math.sqrt(raizesEquacao)) / (2 * a);
            raizesNegativa = (-b - Math.sqrt(raizesEquacao)) / (2 * a);

            System.out.printf("R1 = %.5f%n", raizesPositiva);
            System.out.printf("R2 = %.5f%n", raizesNegativa);
            }
    }
}