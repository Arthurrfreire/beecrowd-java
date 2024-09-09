import java.util.Scanner;

public class Bee1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        double c, salarioFuncionario;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextDouble();

        salarioFuncionario = b * c;
        System.out.printf("NUMBER = %d%n", a);
        System.out.printf("SALARY = U$ %.2f%n", salarioFuncionario);
    }
}