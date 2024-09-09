import java.util.Scanner;

public class Bee1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempoDuracao, calculoHoras, calculoMinutos, calculoSegundos;

        tempoDuracao = sc.nextInt();

        calculoHoras = tempoDuracao / 3600;
        calculoMinutos = tempoDuracao % 3600 / 60;
        calculoSegundos = tempoDuracao % 60;

        System.out.printf("%d:%d:%d%n", calculoHoras, calculoMinutos, calculoSegundos);

        sc.close();
    }
}
