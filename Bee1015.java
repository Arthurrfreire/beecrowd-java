import java.util.Scanner;

public class Bee1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1, y1, x2, y2, distanciaPontos, calculoX, calculoY;

        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        calculoX = x2-x1;
        calculoY = y2-y1;
        distanciaPontos = Math.sqrt(Math.pow(calculoX,2)+Math.pow(calculoY,2));

        System.out.printf("%.4f%n", distanciaPontos);

        sc.close();
    }
}