package ch.modul403;




public class Main {

    public static void main(String[] args) {
                                                                                //Datum muss ein Date Objekt sein

            //poffet = Projekt
            //m = Meeting
            //v = Version/Änderungsnummer

        CalendarEvent poffetm1v1 = new CalendarEvent("KickOff Meeting", "2022-1-4","13:00", "03:00");
        CalendarEvent hoferm1v2 = new CalendarEvent("KickOff Meeting", "2022-1-5", "08:00", "03:00");
        CalendarEvent poffetm2v2 = new CalendarEvent("Zwischenmeeting", "2022-2-12", "08:00", "02:00");
        CalendarEvent poffetm3v3 = new CalendarEvent("Projekt Abschluss", "2022-5-12", "08:00", "04:00");
        CalendarEvent hoferm2v1 = new CalendarEvent("Zwischenmeeting", "2022-6-22", "08:00", "02:00");

        System.out.println("    Titel " + "        Datum " + "  Start " + " Dauer ");
        System.out.println(poffetm1v1);
        System.out.println(hoferm1v2);
        System.out.println(poffetm2v2);
        System.out.println(poffetm3v3);
        System.out.println(hoferm2v1);


    }
}