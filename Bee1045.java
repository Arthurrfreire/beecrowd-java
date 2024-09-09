import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class Bee1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        Double[] lados = {a, b, c};
        Arrays.sort(lados, Collections.reverseOrder());

        a = lados[0];
        b = lados[1];
        c = lados[2];

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (a * a == b * b + c * c) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (a * a > b * b + c * c) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (a * a < b * b + c * c) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((a == b && b != c) || (a == c && b != c) || (b == c && a != b)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}