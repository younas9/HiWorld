public class ØvelseMedBoolean {

    public static void main(String[] args) {

        int x = 27;
        int y = -1;
        int z = 32;
        boolean b = false;

        System.out.println(!b);
        // Denne udskrivning er true

        System.out.println(b || true);
        // Denne udskrivning er true, fordi den ene af værdierne er sand

        System.out.println((x < y) || (x < z));
        // Denne udskrivning er true, fordi det ene regnestykke er sand

        System.out.println(!(x % 2 == 0));
//Denne udskrivning er true, fordi det er falskt at 1 = 0, og det omvendte af det er true

        System.out.println((x % 2 != 0) && b);
//        Denne udskrivning er false fordi at resten af divisionen af 27 med 2 ikke er lig 0,
//        hvilket er true, men && b er false, og derfor fordi begge ligninger ikke er true
//        så er udskrivningen false

        System.out.println(b && !b);
//        Denne udskrivning er false fordi at booleanen er false og kan ikke samtidig være true

        System.out.println(b || !b);
//        Denne udskrivning er true, fordi at den første boolean er uændret,
//        og kun en af resultaterne skal være rigtige for at booleanen bliver true

        System.out.println((x < y) == b);
//        Denne udskrivning er true, fordi at det er rigtigt
//        at det er false at 27 er mindre end -1

    }
}
