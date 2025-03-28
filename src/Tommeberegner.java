import java.util.Scanner;

public class Tommeberegner {

    public static void main(String[] args) {

        System.out.println("Dette program konverterer tommer om til centimeter.");
        System.out.println("Hvor mange tommer vil du konvertere til centimeter?");

        Scanner scanner = new Scanner(System.in);
        double tommer = scanner.nextDouble();

        double centimeter = 2.54;

        System.out.println("Du har indtastet værdien " + tommer + ", som svarer til " + tommer * centimeter + " antal tommer.");

    }
}
