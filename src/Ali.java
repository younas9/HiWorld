import java.util.Scanner;

public class Ali {

    public static void main(String[] args) {
        System.out.println("Indtast nummer 1 hvis du kan lide chokolade, eller indtast 2 hvis du ikke kan");

        Scanner input = new Scanner(System.in);
        int inputtedNum = input.nextInt();

        if (inputtedNum < 2) {
            System.out.println("Du er rigtig sej");
        } else {
            System.out.println("Du skal have en flad");
        }
    }
}
