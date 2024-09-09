import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double nota1, nota2, nota3, nota4, calculoMedia, mediaExame, exameFinal;

        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();
        nota4 = sc.nextDouble();

        calculoMedia = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4) + (nota4 * 1)) / 10;

        System.out.println("Media: " + df.format(calculoMedia));

        if (calculoMedia >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (calculoMedia < 7 && calculoMedia >= 5) {
            System.out.println("Aluno em exame.");
            exameFinal = sc.nextDouble();
                    System.out.println("Nota do exame: " + df.format(exameFinal));
            mediaExame = (calculoMedia + exameFinal) / 2;
            if (mediaExame >= 5.0) {
                System.out.println("Aluno aprovado.");
            }else {
                System.out.println("Aluno reprovado.");
            }

                    System.out.println("Media final: " + df.format(mediaExame));
        }else {
            System.out.println("Aluno reprovado.");
        }

    }
}