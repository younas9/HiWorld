import java.util.Scanner;

public class ZodiacSignFinder2 {

    public static void main(String[] args) {

        System.out.println("Dette er et program der fortæller dig hvad dit stjernetegn er.");
        System.out.println("Hvilken dag blev du født på? (Indtast et tal)");

        Scanner scanner = new Scanner(System.in);
        int dag = scanner.nextInt();

        System.out.println("Hvilken måned blev du født i? (Indtast et tal)");
        int maaned = scanner.nextInt();

        String stjernetegn = "";

        switch (maaned) {

            case 1:
                if (dag <= 20) {
                    stjernetegn = "Stenbuk";
                } else {
                    stjernetegn = "Vandmand";
                }
                break;

            case 2:
                if (dag <= 18) {
                    stjernetegn = "Vandmand";
                } else {
                    stjernetegn = "Fisk";
                }
                break;

            case 3:
                if (dag <= 20) {
                    stjernetegn = "Fisk";
                } else {
                    stjernetegn = "Vædder";
                }
                break;

            case 4:
                if (dag <= 19) {
                    stjernetegn = "Vædder";
                } else {
                    stjernetegn = "Tyr";
                }
                break;

            case 5:
                if (dag <= 21) {
                    stjernetegn = "Tyr";
                } else {
                    stjernetegn = "Tvilling";
                }
                break;

            case 6:
                if (dag <= 21) {
                    stjernetegn = "Tvilling";
                } else {
                    stjernetegn = "Krebs";
                }
                break;

            case 7:
                if (dag <= 22) {
                    stjernetegn = "Krebs";
                } else {
                    stjernetegn = "Løve";
                }
                break;

            case 8:
                if (dag <= 22) {
                    stjernetegn = "Løve";
                } else {
                    stjernetegn = "Jomfru";
                }
                break;

            case 9:
                if (dag <= 22) {
                    stjernetegn = "Jomfru";
                } else {
                    stjernetegn = "Vægt";
                }
                break;

            case 10:
                if (dag <= 22) {
                    stjernetegn = "Vægt";
                } else {
                    stjernetegn = "Skorpion";
                }
                break;

            case 11:
                if (dag <= 22) {
                    stjernetegn = "Skorpion";
                } else {
                    stjernetegn = "Skytte";
                }
                break;

            case 12:
                if (dag <= 21) {
                    stjernetegn = "Skytte";
                } else {
                    stjernetegn = "Vandmand";
                }
                break;
        }
        System.out.println("Dit stjernetegn er : " + stjernetegn);
    }
}
