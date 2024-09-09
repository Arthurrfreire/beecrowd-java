import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Bee1052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> mes = new ArrayList<>();

        mes.add("January");
        mes.add("February");
        mes.add("March");
        mes.add("April");
        mes.add("May");
        mes.add("June");
        mes.add("July");
        mes.add("August");
        mes.add("September");
        mes.add("October");
        mes.add("November");
        mes.add("December");

        int mesAno = sc.nextInt();

        System.out.println(mes.get(mesAno - 1));
    }
}
