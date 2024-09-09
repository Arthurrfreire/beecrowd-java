import java.util.Scanner;

public class Bee1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double calculoArea;
        double n = 3.14159;

        double a = sc.nextDouble();

        calculoArea = n * (a * a);
        System.out.printf("A=%.4f%n", calculoArea);

        sc.close();
    }
}
