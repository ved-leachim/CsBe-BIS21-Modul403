package ch.csbe.modul403;

import java.text.MessageFormat;
import java.time.Year;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Geben Sie ihren Namen ein: ");
        String name = scan.nextLine();

        // CHECK NAME
        if (name == "")
            System.out.println("Haben Sie keinen Namen?");
        else
            System.out.println(MessageFormat.format("Ihr Name ist ''{0}''.", name));

        System.out.print("Geben Sie ihren Wohnort ein: ");
        String wohnort = scan.nextLine();

        // CHECK LOCATION
        if (wohnort.length() != 0)
            System.out.println(MessageFormat.format("Ihr Wohnort heisst ''{0}''", wohnort));
        else
            System.out.println("Sind Sie obdachlos?");

        System.out.println("Geben Sie Ihr Geburtsjahr ein (Format YYYY)");
        int jahr = scan.nextInt();
        // CHECK YEAR
        if (jahr >= 1910 && jahr < Year.now().getValue()) {
            System.out.println(MessageFormat.format("Ihr Geburtsjahr ist: ''{0}''", jahr));
            System.out.print("Geben Sie Ihren Geburtsmonat ein (Format MM): ");
            int monat = scan.nextInt();
            // CHECK MONTH
            if (monat >= 1 && monat <= 12) {
                System.out.println(MessageFormat.format("Ihr Geburtsmonat ist ''{0}''", monat));
                System.out.print("Geben Sie den Kalendertag ihrer Geburt ein (Format DD): ");
                int tag = scan.nextInt();
                // CHECK DAY
                if (tag >= 0 && tag <= 31) {
                    System.out.println(MessageFormat.format("Der Kalendertag ihrer Geburt ist ''{0}''", tag));
                    System.out.println(MessageFormat.format("{0} {1} {2}", name, wohnort, tag + "." + monat + "." + jahr));
                }
                else {
                    System.out.println("Ihre Tagesangabe im Geburtstag entspricht nicht dem gültigen Wertebereich.");
                }
            }
            else {
                System.out.println("Ihre Monatsangabe im Geburtstag entspricht nicht dem gültigen Wertebereich.");
            }
        }
        else {
            System.out.println("Ihre Jahresangabe im Geburtstag entspricht nicht dem gültigen Wertebereich.");
        }
    }
}
