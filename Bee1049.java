import java.util.Scanner;

public class Bee1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tipoAnimal1, tipoAnimal2, tipoAnimal3;

        tipoAnimal1 = sc.nextLine().toLowerCase();
        tipoAnimal2 = sc.nextLine().toLowerCase();
        tipoAnimal3 = sc.nextLine().toLowerCase();

        if (tipoAnimal1.equals("vertebrado") && tipoAnimal2.equals("ave") && tipoAnimal3.equals("carnivoro")) {
            System.out.println("aguia");
        }else if (tipoAnimal1.equals("vertebrado") && tipoAnimal2.equals("ave") && tipoAnimal3.equals("onivoro")) {
            System.out.println("pomba");
        }else if (tipoAnimal1.equals("vertebrado") && tipoAnimal2.equals("mamifero") && tipoAnimal3.equals("onivoro")) {
            System.out.println("homem");
        }else if (tipoAnimal1.equals("vertebrado") && tipoAnimal2.equals("mamifero") && tipoAnimal3.equals("herbivoro")) {
            System.out.println("vaca");
        }else if (tipoAnimal1.equals("invertebrado") && tipoAnimal2.equals("inseto") && tipoAnimal3.equals("hematofago")) {
            System.out.println("pulga");
        }else if (tipoAnimal1.equals("invertebrado") && tipoAnimal2.equals("inseto") && tipoAnimal3.equals("herbivoro")) {
            System.out.println("lagarta");
        }else if (tipoAnimal1.equals("invertebrado") && tipoAnimal2.equals("anelideo") && tipoAnimal3.equals("hematofago")) {
            System.out.println("sanguessuga");
        }else if (tipoAnimal1.equals("invertebrado") && tipoAnimal2.equals("anelideo") && tipoAnimal3.equals("onivoro")) {
            System.out.println("minhoca");
    }
    }
}
