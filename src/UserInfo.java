import java.util.Scanner;

public class UserInfo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Indtast dit navn");
        String navn = scanner.nextLine();

        System.out.println("Indtast din yndlingsfarve");
        String yndlingsfarve = scanner.nextLine();

        System.out.println("Tak for dine svar");
        System.out.println("Dit navn er " + navn);
        System.out.println("Din yndlingsfarve er " + yndlingsfarve);

    }
}
