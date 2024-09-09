import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double salarioPessoa, impostoSalario = 0.0;

        salarioPessoa = sc.nextDouble();

        if (salarioPessoa <= 2000.00) {
            System.out.println("Isento");
        } else if (salarioPessoa > 2000.00 && salarioPessoa <= 3000.00) {
            impostoSalario += (salarioPessoa - 2000.00) * 0.08;
            System.out.println("R$ " + df.format(impostoSalario));
        } else if (salarioPessoa > 3000.00 && salarioPessoa <= 4500.00) {
            impostoSalario += (1000.00 * 0.08);
            impostoSalario += (salarioPessoa - 3000.00) * 0.18;
            System.out.println("R$ " + df.format(impostoSalario));
        } else if (salarioPessoa > 4500.00) {
            impostoSalario += (1000.00 * 0.08);
            impostoSalario += (1500.00 * 0.18);
            impostoSalario += (salarioPessoa - 4500.00) * 0.28;
            System.out.println("R$ " + df.format(impostoSalario));
        }
    }
}