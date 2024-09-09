import java.util.Scanner;

public class Bee1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, volumeEsfera, pi = 3.14159;

        a = sc.nextDouble();

        volumeEsfera = (4/3.0) * pi * a * a * a;

        System.out.printf("VOLUME = %.3f%n", volumeEsfera);
    }
}
