import java.util.Scanner;

public class Bee1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, mediaAluno;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        mediaAluno = ((a * 2) + (b * 3) + (c * 5)) / 10;

        System.out.printf("MEDIA = %.1f%n", mediaAluno);
    }
}