import java.util.Scanner;

public class Bee1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, calculoPerimetro, calculoArea;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            calculoPerimetro = a + b + c;
            System.out.printf("Perimetro = %.1f%n", calculoPerimetro);
        } else {
            calculoArea = ((a + b) * c) / 2;
                System.out.printf("Area = %.1f%n", calculoArea);
            }
        }
}