import java.util.Scanner;

public class Trafiklys {

    public static void main(String[] args) {

        System.out.println("Vælg en farv (RØD, GUL eller GRØN)");
        Scanner scanner = new Scanner(System.in);
        String farve = scanner.nextLine();

        switch (farve.toLowerCase()) {

            case "rød":
                System.out.println("Stop");
                break;

            case "gul":
                System.out.println("Vent");
                break;

            case "grøn":
                System.out.println("Gå");
                break;

            default:
                System.out.println("Din indtastede værdi er ugyldig");
                break;

        }
        scanner.close();
    }
}
