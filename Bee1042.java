import java.util.Scanner;
import java.util.Arrays;

public class Bee1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int[] original = {a, b, c};
        int[] ordenado = Arrays.copyOf(original, original.length);
        Arrays.sort(ordenado);

        for (int num : ordenado) {
            System.out.println(num);
        }
        System.out.println();

        for (int num : original) {
            System.out.println(num);
        }
    }
}