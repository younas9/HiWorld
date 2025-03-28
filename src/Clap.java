import java.util.Scanner;

public class Clap {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String output = input.replace(" ", "👏").toUpperCase();

        System.out.println(output);

    }
}


