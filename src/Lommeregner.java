import java.util.Scanner;

public class Lommeregner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvilken værdi ville du give 'a'?");
        int a = scanner.nextInt();
        System.out.println("Hvilken værdi ville du give 'b'?");
        int b = scanner.nextInt();

        int sum = add(a, b);
        int sum1 = subtract(a, b);
        int sum2 = multiply(a, b);
        double sum3 = divide(a, b);

//
//        System.out.println("Du har indtastet værdierne " + a + ", og " + b + " og hvis man plusser dem" +
//                " multiplere dem og dividere dem, så får man værdierne" + sum + sum1 + sum2 + sum3);
        System.out.println("Du har indtastet værdierne " + a + ", og " + b);
        System.out.println("Hvis man plusser dem, så får man " + sum);
        System.out.println("Hvis man minusser dem, så får man " + sum1);
        System.out.println("Hvis man ganger dem, så får man " + sum2);
        System.out.println("Hvis man dividere dem, så får man " + sum3);

    }

    public static int add(int a, int b) {

        return (a + b);
    }

    public static int subtract(int a, int b) {

        return (a - b);

    }

    public static int multiply(int a, int b) {

        return (a * b);

    }

    public static double divide(double a, double b) {

        return (a / b);

    }

}
