import java.util.Scanner;

public class Cookies {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hvor mange cookies vil du bage?");
        int antal = scanner.nextInt();

        System.out.println("Hvor meget mel skal der bruges?");
        double mel = scanner.nextDouble();

        double melPerCookie = 7.5;
        double samletMel = melPerCookie * antal;

        System.out.println("Du skal bruge " + samletMel + " gram per cookie, for at bage " + antal + " antal cookies");

    }
}


