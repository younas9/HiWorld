public class Forloop {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {

            System.out.println("Hello World");
        }

        for (int i1 = 1; i1 <= 10; i1++) {
            System.out.println(i1);
        }

        for (int i2 = 1; i2 <= 10; i2++) {
            System.out.println("*");
        }

        for (int i3 = 5; i3 >= -5; i3--) {
            System.out.println(i3);
        }

        for (int i4 = 5; i4 < 30; i4 += 3) {
            System.out.println(i4);
        }

        int i = 1;
        while (i <= 3) {
            System.out.println("Hello World");

            i++;
        }

        int i9 = 1;
        while (i9 <= 10) {
            System.out.println(i9);
            i9++;
        }
        int i10 = 0;
        while (i10 < 10) {
            System.out.println("*");
            i10++;
        }

        int i11 = 5;
        while (i11 >= -5) {
            System.out.println(i11);
            i11--;
        }

        int i12 = 5;
        while (i12 < 30) {
            System.out.println(i12);
            i12 += 3;
        }

        System.out.println("`i am now printing for the 1st time`");
        System.out.println("`i am now printing for the 2nd time´");
        System.out.println("´i am now printing for the 3rd time´");


        for (int i5 = 3; i5 <= 10; i5++) {
            System.out.println("i am now printing for the " + i5 + "th time");
        }

        for (int i6 = 0; i6 <= 12; i6 += 2) {
            System.out.println(i6);
        }

        {
            for (int i7 = 4; i7 <= 79; i7 += 15)
                System.out.println(i7);
        }

        for (int i13 = 30; i13 >= -20; i13 -= 10) {
            System.out.println(i13);
        }
        for (int i14 = -7; i14 <= 13; i14 += 4) {
            System.out.println(i14);
        }

        for (int i15 = 97; i15 >= 82; i15 -= 3) {
            System.out.println(i15);
        }

        int i16 = 3;
        while (i16 < 30) {
            i16 += 3;
            System.out.println(i16);
        }

        for (int alder = 0; alder < 100; alder++) {

            System.out.println("Alder:" + alder);

            if (alder == 6) {
                System.out.println("Alder: " +alder+ " Du startede i skole");
            } else if (alder == 18) {
                System.out.println("Alder: " + alder + " Er blevet voksen");
            } else if (alder == 20) {
                System.out.println("Alder: " + alder + " Du er blevet gift");
            } else if (alder == 30) {
                System.out.println("Alder: " + alder + " Du er blevet tredive");
            } else if (alder == 63) {
                System.out.println("Alder: " + alder + " Du er død");
            } else if (alder == 99) {
                System.out.println("Alder: " +alder+" Du har være død i 36 år bro");
            }
        }
        {
            int minutter = 10;
            System.out.println("Brøkdele af minutter der er gået");
            System.out.println(minutter/60);
        }
        {
            double minutter = 10.0;
            System.out.println("Brøkdele af minutter der er gået");
            System.out.println(minutter/60);

        }
        {
            int minutter = 10;
            System.out.println("Brøkdele af sekunder der er gået");
            System.out.println((double)minutter/60);
        }
        {
            final int MINUTTER_PER_TIME = 60;
            System.out.println("Minutter per time");
            System.out.println(MINUTTER_PER_TIME);
        }
    }
}