import java.util.Scanner;

public class Ascii {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        for (int i = 1; i <= input; i++) {


            for (int i1 = 1; i1 <= i; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = input; i >= 1; i--) {

            for (int i1 = 1; i1 <= i; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
