package LB2_403;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Registrierungsprogramm {

    //static = Objekt - Unabhängigkeit
    public static Person[] registeredPersons = new Person[10];

    public static String hasitsownHoushold;
    public static String vorname;
    public static String nachname;
    public static String alter;
    public static String strasse;
    public static String city;
    public static String plz;
    public static int UserInput;


    static Scanner scan = new Scanner(System.in);
    static Person newPerson = new Person();

    public static void main(String[] args) {
        //While Schleife um das Programm am laufen zuhalten
        while (UserInput != 5) {
            begrüssung();
            Einführung();
            //Benutzereingabe einscannen und durch die mögliche Funktionen einteilen und ausführen.
            UserInput = scan.nextInt();
            if (UserInput == 1) {
                Hauptmenue();
                RegistrierendePersonen();
                AdresseAngaben();
            } else if (UserInput == 2) {
                displayPersons();
            } else if (UserInput == 3) {
                PersonAnzeige();
            } else if (UserInput == 0) {
                System.exit(0);
            }
            //Code erweiterungspotenzial/ registrierte personen löschen.
        }
    }

    public static void Hauptmenue() {
        //eine möglichkeit um ins Hauptmenü zurückzukehren anbieten
        System.out.println("Mit 0 gelangen Sie ins Hauptmenue: 1 fortzufahren: ");
        //Bei falscher Eingabe soll der try/catch eingreifen.
        try {
            int hauptmenue = scan.nextInt();
            if (hauptmenue == 0) {
                UserInput = 1;
            }
            //Ausgabe nach fehlerhaften Eingabe definieren.
        }catch (InputMismatchException exception) {
            System.out.println("Das war ein falscher Wert: ");
            UserInput = 1;
        }
    }

    public  static  void begrüssung() {
        System.out.println("===============================");
        System.out.println("Herzlich Willkommen");
        System.out.println("===============================");
    }

    public static void Einführung() {
        System.out.println("Wählen Sie 1, um sich zu registrieren. ");
        System.out.println("Wählen Sie 2, um alle registrierte Personen anzusehen. ");
        System.out.println("Wählen Sie 3, um registrierte Person anzusehen.");
        System.out.println("Wählen Sie 0, um das Programm zu beenden.");
    }

    public static void RegistrierendePersonen() {
        //Die Eingaben einscannen in die Varable zuweisen und in den Objeten speihern.
        System.out.println("Geben Sie Ihren vornamen ein: ");
        vorname = scan.nextLine();
        newPerson.setFirstName(vorname);

        System.out.println("Geben Sie Ihren Nachnamen ein: ");
        nachname = scan.nextLine();
        newPerson.setLastName(nachname);

        System.out.println("Geben Sie Ihren Alter ein: ");
        alter = scan.nextLine();
        newPerson.setAge(Integer.parseInt(alter));
        //Die Eingaben der Objekt in Array speichern
        for (int i = 0; i < registeredPersons.length; i++) {
            //Array[]
            registeredPersons[i] = newPerson;
        }
    }

    public  static  void AdresseAngaben() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Haben Sie einen eigenen Haushal? ");
        hasitsownHoushold = scan.nextLine();
        if (hasitsownHoushold.equals("Ja".toLowerCase(Locale.ROOT))) {
            newPerson.setHasItsOwnHousehold(true);
            Adresse();

        } else if (hasitsownHoushold.equals("Nein")) {
            newPerson.setHasItsOwnHousehold(false);
        }
    }

    public static void Adresse() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie die Strasse ein: ");
        strasse = scan.nextLine();
        newPerson.setStreet(strasse);

        System.out.println("Geben Sie den Ort ein: ");
        city = scan.nextLine();
        newPerson.setCity(city);

        System.out.println("Geben Sie die Postleitzahl ein: ");
        plz = scan.nextLine();
        newPerson.setPLZ(Integer.parseInt(plz));
    }

    public static void  displayPersons() {
        for (int i = 0; i <= registeredPersons.length; i++) {
            System.out.println(registeredPersons[i].getFirstName());
            System.out.println(registeredPersons[i].getLastName());
            System.out.println(registeredPersons[i].getAge());
            System.out.println(registeredPersons[i].getHasItsOwnHousehold());
                System.out.println("Eigener Haushalt: ja");
                System.out.println(registeredPersons[i].getStreet());
                System.out.println(registeredPersons[i].getCity());
                System.out.println(registeredPersons[i].getPLZ());
                System.out.println("Keine Adresse Angaben: ");
        }
    }
    public static void PersonAnzeige() {
        for (int i = 0; i < registeredPersons.length; i++) {
            int personauswahl = scan.nextInt();
            if (personauswahl == 1) {
                System.out.println(registeredPersons[0].getFirstName());
                System.out.println(registeredPersons[0].getLastName());
                System.out.println(registeredPersons[0].getAge());
                System.out.println(registeredPersons[0].getHasItsOwnHousehold());
                System.out.println(registeredPersons[0].getStreet());
                System.out.println(registeredPersons[0].getCity());
                System.out.println(registeredPersons[0].getPLZ());
            } else if (personauswahl == 2) {
                System.out.println(registeredPersons[1].getFirstName());
                System.out.println(registeredPersons[1].getLastName());
                System.out.println(registeredPersons[1].getAge());
                System.out.println(registeredPersons[1].getHasItsOwnHousehold());
                System.out.println(registeredPersons[1].getStreet());
                System.out.println(registeredPersons[1].getCity());
                System.out.println(registeredPersons[1].getPLZ());
            } else if (personauswahl == 3) {
                System.out.println(registeredPersons[2].getFirstName());
                System.out.println(registeredPersons[2].getLastName());
                System.out.println(registeredPersons[2].getAge());
                System.out.println(registeredPersons[2].getHasItsOwnHousehold());
                System.out.println(registeredPersons[2].getStreet());
                System.out.println(registeredPersons[2].getCity());
                System.out.println(registeredPersons[2].getPLZ());
            } else if (personauswahl == 4) {
                System.out.println(registeredPersons[3].getFirstName());
                System.out.println(registeredPersons[3].getLastName());
                System.out.println(registeredPersons[3].getAge());
                System.out.println(registeredPersons[3].getHasItsOwnHousehold());
                System.out.println(registeredPersons[3].getStreet());
                System.out.println(registeredPersons[3].getCity());
                System.out.println(registeredPersons[3].getPLZ());
            } else if (personauswahl == 5) {
                System.out.println(registeredPersons[4].getFirstName());
                System.out.println(registeredPersons[4].getLastName());
                System.out.println(registeredPersons[4].getAge());
                System.out.println(registeredPersons[4].getHasItsOwnHousehold());
                System.out.println(registeredPersons[4].getStreet());
                System.out.println(registeredPersons[4].getCity());
                System.out.println(registeredPersons[4].getPLZ());
            } else if (personauswahl == 6) {
                System.out.println(registeredPersons[5].getFirstName());
                System.out.println(registeredPersons[5].getLastName());
                System.out.println(registeredPersons[5].getAge());
                System.out.println(registeredPersons[5].getHasItsOwnHousehold());
                System.out.println(registeredPersons[5].getStreet());
                System.out.println(registeredPersons[5].getCity());
                System.out.println(registeredPersons[5].getPLZ());
            } else if (personauswahl == 7) {
                System.out.println(registeredPersons[6].getFirstName());
                System.out.println(registeredPersons[6].getLastName());
                System.out.println(registeredPersons[6].getAge());
                System.out.println(registeredPersons[6].getHasItsOwnHousehold());
                System.out.println(registeredPersons[6].getStreet());
                System.out.println(registeredPersons[6].getCity());
                System.out.println(registeredPersons[6].getPLZ());
            } else if (personauswahl == 8) {
                System.out.println(registeredPersons[7].getFirstName());
                System.out.println(registeredPersons[7].getLastName());
                System.out.println(registeredPersons[7].getAge());
                System.out.println(registeredPersons[7].getHasItsOwnHousehold());
                System.out.println(registeredPersons[7].getStreet());
                System.out.println(registeredPersons[7].getCity());
                System.out.println(registeredPersons[7].getPLZ());
            } else if (personauswahl == 9) {
                System.out.println(registeredPersons[8].getFirstName());
                System.out.println(registeredPersons[8].getLastName());
                System.out.println(registeredPersons[8].getAge());
                System.out.println(registeredPersons[8].getHasItsOwnHousehold());
                System.out.println(registeredPersons[8].getStreet());
                System.out.println(registeredPersons[8].getCity());
                System.out.println(registeredPersons[8].getPLZ());
            } else if (personauswahl == 10) {
                System.out.println(registeredPersons[9].getFirstName());
                System.out.println(registeredPersons[9].getLastName());
                System.out.println(registeredPersons[9].getAge());
                System.out.println(registeredPersons[9].getHasItsOwnHousehold());
                System.out.println(registeredPersons[9].getStreet());
                System.out.println(registeredPersons[9].getCity());
                System.out.println(registeredPersons[9].getPLZ());
            }
        }
    }
}