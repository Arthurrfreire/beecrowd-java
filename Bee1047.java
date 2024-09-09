import java.util.Scanner;

public class Bee1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial, minutoInicial, horaFinal, minutoFinal;
        int inicioMinutos, fimMinutos, duracaoMinutos, duracaoHoras, duracaoMinutos2;

        horaInicial = sc.nextInt();
        minutoInicial = sc.nextInt();
        horaFinal = sc.nextInt();
        minutoFinal = sc.nextInt();

        inicioMinutos = (horaInicial * 60) + minutoInicial;
        fimMinutos = (horaFinal * 60) + minutoFinal;

        if (horaInicial == horaFinal && minutoInicial == minutoFinal) {
            duracaoHoras = 24;
            duracaoMinutos = 0;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", duracaoHoras, duracaoMinutos);
        }else if (fimMinutos >= inicioMinutos) {
            duracaoMinutos = fimMinutos - inicioMinutos;
            duracaoHoras = duracaoMinutos / 60;
            duracaoMinutos2 = duracaoMinutos % 60;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", duracaoHoras, duracaoMinutos2);
        } else if (fimMinutos < inicioMinutos) {
            duracaoMinutos = ((24 * 60) - inicioMinutos) + fimMinutos;
            duracaoHoras = duracaoMinutos / 60;
            duracaoMinutos2 = duracaoMinutos % 60;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", duracaoHoras, duracaoMinutos2);
        }
    }
}
