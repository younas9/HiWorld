import java.util.Scanner;

public class ZodiacSignFinder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dette er et program der viser dig hvad dit stjernetegn er.");
        System.out.println("Hvilken dag blev du født på? (Indtast tal)");
        int dato = scanner.nextInt();

        System.out.println("Hvilken måned blev du født i? (Indtast tal)");
        int maaned = scanner.nextInt();

        String stjernetegn = "";

        if ((dato >= 21 && maaned == 1) || (dato <= 21 && maaned == 2)) {
            stjernetegn = "Vandmand";
        } else if ((dato >= 19 && maaned == 2) || (dato <= 20 && maaned == 3)) {
            stjernetegn = "Fisk";
        } else if ((dato >= 21 && maaned == 3) || (dato <= 19 && maaned == 4)) {
            stjernetegn = "Vædder";
        } else if ((dato >= 20 && maaned == 4) || (dato <= 21 && maaned == 5)) {
            stjernetegn = "Tyr";
        } else if ((dato >= 22 && maaned == 5) || (dato <= 21 && maaned == 6)) {
            stjernetegn = "Tvilling";
        } else if ((dato >= 22 && maaned == 6) || (dato <= 22 && maaned == 7)) {
            stjernetegn = "Krebs";
        } else if ((dato >= 23 && maaned == 7) || (dato <= 23 && maaned == 8)) {
            stjernetegn = "Løve";
        } else if ((dato >= 24 && maaned == 8) || (dato <= 23 && maaned == 9)) {
            stjernetegn = "Jomfru";
        } else if ((dato >= 24 && maaned == 9) || (dato <= 22 && maaned == 10)) {
            stjernetegn = "Vægt";
        } else if ((dato >= 23 && maaned == 10) || (dato <= 22 && maaned == 11)) {
            stjernetegn = "Skorpion";
        } else if ((dato >= 23 && maaned == 11) || (dato <= 23 && maaned == 12)) {
            stjernetegn = "Skytten";
        } else if ((dato >= 24 && maaned == 12) || (dato <= 20 && maaned == 1)) {
            stjernetegn = "Stenbuk";
        }
        System.out.println("Dit stjernetegn er: " + stjernetegn);
    }
}
