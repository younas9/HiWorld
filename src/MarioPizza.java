import java.util.Scanner;

public class MarioPizza {

    public static void main(String[] args) {
        String velkomst = "Velkommen til Marios Pizzabar";
        String menu = "Vælg en eller flere af vores pizzaer fra vores store menu med et udvalg af mere end 30 pizzaer";

        Scanner scanner = new Scanner(System.in);

        System.out.println(velkomst);
        System.out.println(menu);

        boolean fortsæt = true;
        StringBuilder valgtePizzaer = new StringBuilder();

        while(fortsæt) {
            System.out.print("Vælg en pizza (1-30): ");
            int input = 0;

            try {
                input = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Ugyldigt input. Vær venlig at indtaste et tal.");
                scanner.nextLine();
                continue;
            }

            if(input >= 1 && input <= 30) {
                if (valgtePizzaer.length() > 0) {
                    valgtePizzaer.append(", ");
                }
                valgtePizzaer.append("Pizza " + input);
                System.out.println("Du har valgt pizza nummer: " + input);
            } else {
                System.out.println("Ugyldigt valg, prøv igen.");
            }

            scanner.nextLine();

            System.out.print("Vil du vælge en pizza mere? (ja/nej): ");
            String svar = scanner.nextLine();

            if(svar.equalsIgnoreCase("nej")) {
                fortsæt = false;
            }
        }

        if(valgtePizzaer.length() > 0) {
            System.out.println("Du har valgt følgende pizzaer: " + valgtePizzaer.toString());
            System.out.println("Bestillingen bliver videregivet til Alfonso.");

            System.out.println("Alfonso, venligst forbered følgende pizzaer: " + valgtePizzaer.toString());

            boolean ordrenFærdig = false;
            while (!ordrenFærdig) {
                System.out.print("Er ordren færdig? (ja/nej): ");
                String bekræftelse = scanner.nextLine();

                if(bekræftelse.equalsIgnoreCase("ja")) {
                    ordrenFærdig = true;
                    valgtePizzaer.setLength(0);
                } else {
                    System.out.println("Ordren er ikke færdig, vent venligst.");
                }
            }
        } else {
            System.out.println("Du har ikke valgt nogen pizzaer.");
        }

        scanner.close();
    }
}
