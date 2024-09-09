import java.util.Scanner;

public class Bee1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaIncial, horaFinal, duracaoJogo;

        horaIncial = sc.nextInt();
        horaFinal = sc.nextInt();

        if (horaFinal == horaIncial) {
            duracaoJogo = 24;
            System.out.printf("O JOGO DUROU %d HORA(S)%n", duracaoJogo);
        }else if (horaFinal > horaIncial) {
            duracaoJogo = horaFinal - horaIncial;
            System.out.printf("O JOGO DUROU %d HORA(S)%n", duracaoJogo);
        }else if (horaFinal < horaIncial) {
            duracaoJogo = (24 - horaIncial) + horaFinal;
            System.out.printf("O JOGO DUROU %d HORA(S)%n", duracaoJogo);
        }
    }
}