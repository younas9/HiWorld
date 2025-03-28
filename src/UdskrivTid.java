public class UdskrivTid {

    public static void main(String[] args) {
        int time = 10;
        int minut = 27;
        int sekunder = 30;
        String KlokkenLigeNu = "Klokken er lige nu 10:27:30";
        String Timer = "Timer:10";
        String Minutter = "Minutter:27";
        String Sekunder = "Sekunder:30";

        System.out.println(time * 60 * 60 + minut * 60 + sekunder);
        String AntalSekunder = "Der er gaaet 37650 sekunder siden midnat";
        int SekunderIndtilVidere = 37650;

        String SekunderPaaEtDoegn = "Antal sekunder paa et doegn";
        System.out.println(60 * 60 * 24);
        String AntalSekunderDoegn = "Der er 86400 sekunder paa et doegn";
        int doegn = 86400;
        System.out.println(doegn - SekunderIndtilVidere);
        String SekunderTilMidnat = "Der er 48750 sekunder til midnat";

        int TimeNu = 14;
        int MinutNu = 23;
        int SekundtNu = 40;
        String KlokkenErLigeNu = "Klokken er lige nu 14:23:30";

        System.out.println(TimeNu - time);
        System.out.println(MinutNu - minut);
        System.out.println(SekundtNu - sekunder);
        String Tidsforskel = "Der er gaaet 3 timer og 57 minutter og 10 sekunder";

    }
}

