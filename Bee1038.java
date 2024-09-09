import java.util.Scanner;

public class Bee1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoProduto, quantidadeProduto;
        double produto1, produto2, produto3, produto4, produto5;

        codigoProduto = sc.nextInt();
        quantidadeProduto = sc.nextInt();

        if (codigoProduto == 1 ) {
            produto1 = quantidadeProduto * 4;
            System.out.printf("Total: R$ %.2f%n", produto1);
        }else if (codigoProduto == 2 ) {
            produto2 = quantidadeProduto * 4.50;
            System.out.printf("Total: R$ %.2f%n", produto2);
        }else if (codigoProduto == 3 ) {
            produto3 = quantidadeProduto * 5.00;
            System.out.printf("Total: R$ %.2f%n", produto3);
        }else if (codigoProduto == 4 ) {
            produto4 = quantidadeProduto * 2.00;
            System.out.printf("Total: R$ %.2f%n", produto4);
        }else if (codigoProduto == 5 ) {
            produto5 = quantidadeProduto * 1.50;
            System.out.printf("Total: R$ %.2f%n", produto5);
        }
        sc.close();
    }
}
