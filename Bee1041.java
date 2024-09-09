import java.util.Scanner;
import java.text.DecimalFormat;

public class Bee1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double pontoX, pontoY;

        pontoX = sc.nextDouble();
        pontoY = sc.nextDouble();

        if (pontoX > 0 && pontoY > 0) {
            System.out.println("Q1");
        }else if (pontoX < 0 && pontoY > 0) {
            System.out.println("Q2");
        }else if (pontoX < 0 && pontoY < 0) {
            System.out.println("Q3");
        }else if (pontoX > 0 && pontoY < 0) {
            System.out.println("Q4");
        }else if (pontoX == 0 && pontoY == 0) {
            System.out.println("Origem");
        }else if (pontoX == 0 && pontoY != 0) {
            System.out.println("Eixo Y");
        }else if (pontoX != 0 && pontoY == 0) {
            System.out.println("Eixo X");
        }

    }
}
