import java.util.Scanner;

public class Portoberegner {

    public static void main(String[] args) {

        System.out.println("Hvor meget vejer det brev du vil sende?");
        Scanner scanner = new Scanner(System.in);

        int vaegt = scanner.nextInt();

        int hundredeGram = 29;
        int toHundredeOgHalvtredsGram = 58;
        int toTusind = 87;

        int pris = 0;

        if (vaegt <= 100) {
            pris = 29;
        } else if (vaegt <= 250) {
            pris = 58;
        } else if (vaegt <= 2000) {
            pris = 87;
        } else if (vaegt == 0 || vaegt > 2000) {
            System.out.println("Et brev med denne vægt kan vi ikke sende");
        }

        System.out.println("Din indtastede vægt er " + vaegt + ", og din pris er " + pris);
    }


}
