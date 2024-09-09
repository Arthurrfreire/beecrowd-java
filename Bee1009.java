import java.util.Scanner;

public class Bee1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a;
        double b,c, comissaoSalario, novoSalario;

        a = sc.nextLine();
        b = sc.nextDouble();
        c = sc.nextDouble();

        comissaoSalario = c * 0.15;
        novoSalario = comissaoSalario + b;

        System.out.printf("TOTAL = R$ %.2f%n", novoSalario);

        sc.close();
    }
}