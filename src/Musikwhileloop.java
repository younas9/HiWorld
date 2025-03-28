import java.util.Scanner;

public class Musikwhileloop {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOnRepeat = true;

        while (isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song " +
                    "off of repeat? yes/no");
            String input = scanner.next();

            if ("yes".equals(input)) {
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song");
    }
}

