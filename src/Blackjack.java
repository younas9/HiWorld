import java.util.Random;
import java.util.Scanner;

public class Blackjack {

    public static void main(String[] args) {

        System.out.println("Dette er et Blackjack program. Velkommen til.");
        System.out.println("Du starter nu med at kaste");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        boolean spilSlut = false;
        boolean blackjack = false;

        int terning1 = random.nextInt(6) + 1;
        int terning2 = random.nextInt(6) + 1;
        int samletSum = terning1 + terning2;

        System.out.println("Du har slået værdierne: " + terning1 + ", og " + terning2 + ".");
        System.out.println("Den samlede værdi for kastene er: " + samletSum);


        while (!spilSlut && samletSum < 21) {
            System.out.println("Vil du gerne kaste igen? (ja/nej)");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("ja")) {
                int terning11 = random.nextInt(6) + 1;
                int terning22 = random.nextInt(6) + 1;
                int samletSum1 = terning11 + terning22;

                System.out.println("Du har slået værdierne: " + terning11 + " og " + terning22 + ", som sammen giver " + samletSum1 + ".");
                samletSum += samletSum1;
                System.out.println("Den samlede værdi for alle terningkastene er: " + samletSum);

                if (samletSum > 21) {
                    System.out.println("Værdien for alle dine terningkast har oversteget 21, og du har derfor tabt spillet.");
                    System.out.println();
                    spilSlut = true;
                }
                if (samletSum == 21) {
                    blackjack = true;
                }
                if (blackjack) {
                    System.out.println("TILLYKKE du har vundet da du har fået en score på 21");
                }

            } else if (input.equals("nej")) {
                System.out.println("Du har valgt at stoppe med at kaste, og det er dermed nu computerens tur til at kaste");
                System.out.println();
                spilSlut = true;
                break;
            } else {
                System.out.println("Dit input er ugyldigt. Indtast venligst et gyldigt input (ja/nej)");
            }
        }


        if (!blackjack && spilSlut) {
            int cterning1 = random.nextInt(6) + 1;
            int cterning2 = random.nextInt(6) + 1;
            int samletComputerSum = cterning1 + cterning2;
            System.out.println("Computeren har kastet og har fået værdierne: " + cterning1 + ", og " + cterning2 + ".");
            System.out.println("Den samlede værdi af computerens kast er: " + samletComputerSum);

            while (samletComputerSum <= 16) {
                int cterning11 = random.nextInt(6) + 1;
                int cterning22 = random.nextInt(6) + 1;
                int samletComputerSum1 = cterning11 + cterning22;
                System.out.println("Computeren har kastet og har fået værdierne: " + cterning11 + ", og " + cterning22 + ".");
                samletComputerSum = samletComputerSum + samletComputerSum1;
                System.out.println("Den samlede værdi af computerens kast er: " + samletComputerSum);

            }

            if (samletSum < samletComputerSum && samletComputerSum <= 20) {
                System.out.println();
                System.out.println("Computeren har vundet da den har en værdi der er højere end brugerens.");
            }
            if (samletComputerSum < samletSum && samletSum <= 20) {
                System.out.println();
                System.out.println("TILLYKKE du har vundet da du har opnået en højere score en computeren.");
            }
            if (samletComputerSum > 21) {
                System.out.println();
                System.out.println("TILLYKKE du har vundet da computeren har steget over 21.");
            }
            if (samletSum == samletComputerSum) {
                System.out.println();
                System.out.println("Brugeren har tabt da computeren har har fået den samme score som brugeren.");
            }
        }
    }
}
