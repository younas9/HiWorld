import java.util.Scanner;
public class Test {

    public static void main(String[] args) {

        double studentGPA = 3.45;
        String StudentFirstname = "Harley";
        String StudentLastname = "Quinn";

        System.out.println(StudentFirstname+ " " + StudentLastname+" Has a GPA of "+ studentGPA);
        System.out.println("What do you want to update it to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(StudentFirstname+ " " + StudentLastname + " now has a GPA of " + studentGPA);


    }
}
