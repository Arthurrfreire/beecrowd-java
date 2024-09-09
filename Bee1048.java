import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double salarioFuncionario, novoSalario, calculoReajuste;

        salarioFuncionario = sc.nextDouble();

        if (salarioFuncionario >= 0 && salarioFuncionario <= 400.00 ) {
            calculoReajuste = salarioFuncionario * (1 + 0.15);
            novoSalario = calculoReajuste - salarioFuncionario;
            System.out.printf("Novo salario: %.2f%n", calculoReajuste);
            System.out.printf("Reajuste ganho: %.2f%n", novoSalario);
            System.out.printf("Em percentual: 15 %%%n");
        } else if (salarioFuncionario >= 400.01 && salarioFuncionario <= 800.00 ) {
            calculoReajuste = salarioFuncionario * (1 + 0.12);
            novoSalario = calculoReajuste - salarioFuncionario;
            System.out.printf("Novo salario: %.2f%n", calculoReajuste);
            System.out.printf("Reajuste ganho: %.2f%n", novoSalario);
            System.out.printf("Em percentual: 12 %%%n");
        }else if (salarioFuncionario >= 800.01 && salarioFuncionario <= 1200.00 ) {
            calculoReajuste = salarioFuncionario * (1 + 0.10);
            novoSalario = calculoReajuste - salarioFuncionario;
            System.out.printf("Novo salario: %.2f%n", calculoReajuste);
            System.out.printf("Reajuste ganho: %.2f%n", novoSalario);
            System.out.printf("Em percentual: 10 %%%n");
        }else if (salarioFuncionario >= 1200.01 && salarioFuncionario <= 2000.00 ) {
            calculoReajuste = salarioFuncionario * (1 + 0.07);
            novoSalario = calculoReajuste - salarioFuncionario;
            System.out.printf("Novo salario: %.2f%n", calculoReajuste);
            System.out.printf("Reajuste ganho: %.2f%n", novoSalario);
            System.out.printf("Em percentual: 7 %%%n");
        }else if (salarioFuncionario >= 2000.01) {
            calculoReajuste = salarioFuncionario * (1 + 0.04);
            novoSalario = calculoReajuste - salarioFuncionario;
            System.out.printf("Novo salario: %.2f%n", calculoReajuste);
            System.out.printf("Reajuste ganho: %.2f%n", novoSalario);
            System.out.printf("Em percentual: 4 %%%n");
        }
    }
}
