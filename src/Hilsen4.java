public class Hilsen4 {

    private String navn;

    public static void main(String[] args) {

//        Dette er første opgave:
//        hej("Signe");
//        hej("Poul");
//        hej("Bo");
//        hej("Anne");
//        hej("Mohammad");
//        hej("Habibi");
//        hej("Kevin");

//        Dette er anden opgave:
//        String navn = "Mohammad";
//        System.out.println(hej(navn));
//        String navn1 = "Kevin";
//        System.out.println(hej(navn1));
//        String navn2 = "Habibi";
//        System.out.println(hej(navn2));

//        Dette er tredje opgave:

//        Hilsen4 hilsen = new Hilsen4();

//        Dette er tredje opgave:
//        hilsen.hej("Mohammad");
//        hilsen.hej("Habibi");
//        hilsen.hej("Min bror");
//        hilsen.hej("Kevin");
//        hilsen.hej("Taha");
//        hilsen.hej("Sergen");

        Hilsen4 hilsen = new Hilsen4("Viggo");
        hilsen.hej();

    }


    public Hilsen4 (String name) {

        this.navn = name;
        this.navn = navn;

    }

//    Dette er anden opgave:
//    public static String hej(String name) {

//// Dette er første opgave:
////    System.out.println("Hej " + name + "!");
//
//        return "Hej " + name + "!";

//    Dette er tredje opgave:
    public void hej() {

        System.out.println("Hej jeg hedder " + navn);

    }

}
