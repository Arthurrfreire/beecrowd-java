import java.util.Scanner;

public class Bee1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idadePessoa, idadeAnos, idadeMeses, diasRestantes, idadeDias;

        idadePessoa = sc.nextInt();

        idadeAnos = idadePessoa / 365;
        diasRestantes = idadePessoa % 365;
        idadeMeses = diasRestantes / 30;
        idadeDias = diasRestantes % 30;

        System.out.printf("%d ano(s)%n", idadeAnos);
        System.out.printf("%d mes(es)%n", idadeMeses);
        System.out.printf("%d dia(s)%n", idadeDias);

        sc.close();
    }
}