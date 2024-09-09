import java.util.Scanner;

public class Bee1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoNumero;

        codigoNumero = sc.nextInt();

        if (codigoNumero == 61) {
            System.out.printf("Brasilia%n");
        }else if (codigoNumero == 71) {
            System.out.printf("Salvador%n");
        }else if (codigoNumero == 11) {
            System.out.printf("Sao Paulo%n");
        }else if (codigoNumero == 21) {
            System.out.printf("Rio de Janeiro%n");
        }else if (codigoNumero == 32) {
            System.out.printf("Juiz de Fora%n");
        }else if (codigoNumero == 19) {
            System.out.printf("Campinas%n");
        }else if (codigoNumero == 27) {
            System.out.printf("Vitoria%n");
        }else if (codigoNumero == 31) {
            System.out.printf("Belo Horizonte%n");
        }else {
            System.out.printf("DDD nao cadastrado%n");
        }
    }
}
