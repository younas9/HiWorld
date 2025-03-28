public class ArrayOpgaver {

    public static void main(String[] args) {

        int[] array = {34, 15, 65, 80, 96, 36, 25, 117};
        int[] array1 = {34, 15, 65, 80, 96, 36, 25, 117};
        int[] array2 = {34, 15, 65, 80, 96, 36, 25, 117};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

        }
        String[] hilsen = {"Hej", "med", "dig"};

        for (String ord : hilsen) {
            System.out.print(ord + " ");
        }
        System.out.println();

//        double[] array1 = {3.4, 2.5, 1.2, 6.7};
//        System.out.println(array1[2]);
//
//        System.out.println(array1.length);
//
//        System.out.println();
//
////        System.out.println(array1[4]);

        int[] data = {27, 51, 33, -1, 101,};

        double[] tal = {4.5, 25.3, 12.1, 34.0, 15.5,};

        for (int i = 0; i < tal.length; i++) {
            tal[i] = Math.pow(tal[i], 2);

            System.out.println(tal[i]);
        }
        System.out.println();

        for (int i = 0; i < tal.length; i++) {
            tal[i] = Math.sqrt(tal[i]);
            System.out.println(tal[i]);
        }
        System.out.println();

        for (int i = 0; i < tal.length; i++) {
            if (tal[i] == 34.0) {
                System.out.println("Value found at index " + +i);
            }
        }
        System.out.println();
        double mindste = tal[0];
        double stoerste = tal[0];
        for (int i = 0; i < 4; i++) {
            if (tal[i] < mindste) mindste = tal[i];
            if (tal[i] > stoerste) stoerste = tal[i];
        }
        System.out.println("Værdien for det laveste index i arrayet er: " + mindste);
        System.out.println("Værdien for det højeste index i arrayet er: " + stoerste);

        System.out.println();

        double gennemsnit = average(array);

        System.out.println("Gennemsnittet for arrayet er: " + gennemsnit);

        System.out.println();

        int maksimum = max(array1);

        System.out.println("Den stærste værdi i array1 er: " + maksimum);

        System.out.println();

        int minimum = min(array2);

        System.out.println("Den mindste værdi i array2 er: " + minimum);
    }

    public static double average(int[] array) {
        {
            double sum = 0;

            for (int i = 0; i < array.length; i++) {

                sum = sum + array[i];

            }

            return sum / array.length;
        }
    }

    public static int max(int[] array1) {

        int stoerste1 = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > stoerste1) stoerste1 = array1[i];

        }
        return stoerste1;
    }

    public static int min(int[] array2) {

        int mindste1 = array2[0];
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < mindste1) mindste1 = array2[i];
        }
        return mindste1;

    }
}
