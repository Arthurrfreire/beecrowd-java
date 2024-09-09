import java.util.Scanner;

public class Bee1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double mediaAluno;

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        mediaAluno = ((a * 3.5) + (b * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f%n", mediaAluno);
    }
}