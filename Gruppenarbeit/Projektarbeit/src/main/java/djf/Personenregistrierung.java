package djf;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Personenregistrierung {

    public static Scanner benutzerEingabe = new Scanner(System.in);
    public static List<Person> registeredPersons = new ArrayList<>();
    private static boolean eigenerHaushalt;


    public static void main(String[] args) {

        inputPerson();

    }


    public static void inputPerson() {

        System.out.println("------------------.---------------------------------------------------------");
        System.out.println("Willkommen bei der Personenregistrierungsapp          v.1.0");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Bitte geben Sie die gewünschte Funktion ein:");
        System.out.println("Neue Person registrieren                  --> Drücken Sie Taste `1`");
        System.out.println("Alle vorhandenen Personen anzeigen        --> Drücken Sie Taste `2`");
        System.out.println("Eine Person löschen                       --> Drücken Sie Taste `3`");
        System.out.println("Details einer Person anzeigen             --> Drücken Sie Taste `4`");
        System.out.println("Personenregistrierung schliessen          --> Drücken Sie Taste `5`");
        System.out.println("---------------------------------------------------------------------------");

        int i;

        i = Integer.parseInt(benutzerEingabe.nextLine());

        switch (i) {
            case 1:
                personregistry();
                break;
            case 2:
                personenspeicher();
                break;
            case 3:
                persondeleted();
                break;
            case 4:
                personendetail();
                break;
            case 5:
                personenfinish();
                break;
            default:
                System.err.println("Bitte geben Sie eine Zahl zwischen 1 und 5 an!!");
        }

    }


    public static void personregistry() {


        System.out.println("Möchten Sie vorhandene Person anzeigen?");
        System.out.println("Ja = 1");
        System.out.println("Nein = 0");
        int a = Integer.parseInt(benutzerEingabe.nextLine());

        if (a == 1) {
            persontest();
        } else

            System.out.println("Bitte geben Sie ihren Vornamen ein:");
        String vorname = benutzerEingabe.nextLine();

        System.out.println("Bitte geben Sie ihren Nachnamen ein:");
        String nachname = benutzerEingabe.nextLine();

        System.out.println("Bitte geben Sie ihren Alter ein:");
        Integer alter = Integer.valueOf(benutzerEingabe.nextLine());

        System.out.println("Wohnen Sie in einem eigenen Haushalt?    Ja = j     Nein = n ");
        String eingabe = benutzerEingabe.nextLine();

        boolean eigenerHaushalt = Boolean.parseBoolean(eingabe);
        Person newPerson = new Person();
        switch (eingabe) {

            case "j":
                System.out.println("Bitte geben Sie ihren Strassennamen ein:");
                String strasse = benutzerEingabe.nextLine();

                System.out.println("Bitte geben Sie ihre Stadt ein:");
                String stadt = benutzerEingabe.nextLine();

                System.out.println("Bitte geben Sie ihre Postleitzahl ein:");
                Integer plz = Integer.valueOf(benutzerEingabe.nextLine());

                newPerson.setStreet(strasse);
                newPerson.setCity(stadt);
                newPerson.setPLZ(plz);
                break;

            case "n":
                System.out.println("");
                break;
        }

        newPerson.setFirstName(vorname);
        newPerson.setLastName(nachname);
        newPerson.setAge(alter);
        newPerson.setHasItsOwnHousehold(eigenerHaushalt);

        registeredPersons.add(newPerson);

        System.out.println("Möchten Sie eine neue Person registrieren?");
        System.out.println("Ja = 1");
        System.out.println("Nein = 0");
        a = Integer.parseInt(benutzerEingabe.nextLine());

        if (a == 1) {
            personregistry();
        } else
            inputPerson();
    }


    public static void persontest() {

        personloopsmal();

        System.out.println("Möchten Sie zurück zur Eingabe?");
        System.out.println("Ja = 1");
        System.out.println("Nein = 0    Geht zurück zum Hauptmenü!");
        int a = Integer.parseInt(benutzerEingabe.nextLine());

        if (a == 1) {
            personregistry();
        } else
            inputPerson();
    }


    public static void personenspeicher() {

        System.out.println("Alle vorhandenen Personen anzeigen:");
        System.out.println("");

        System.out.println("Es sind folgende Personen registriert:");
        System.out.println("");

        System.out.println("Anzahl einträge: " + registeredPersons.size());

        personloopsmal();

        System.out.println("");
        System.out.println("Zurück zum Hauptmenü?");
        System.out.println("Nein = 0");
        System.out.println("Ja = 1");
        int a = Integer.parseInt(benutzerEingabe.nextLine());

        if (a == 1) {
            inputPerson();
        } else
            personenspeicher();

    }


    public static void persondeleted() {

        System.out.println("Eine Person löschen:");
        System.out.println("");

        personloopbig();

        System.out.println("Welche Person möchten Sie löschen? 1. Person = Position 0");

        int a = Integer.parseInt(benutzerEingabe.nextLine());

        registeredPersons.remove(a);

        inputPerson();

    }


    public static void personendetail() {

        System.out.println("Details einer Person anzeigen:");
        System.out.println("");

        personloopsmal();

        System.out.println("Zu welcher Person möchten Sie die Details sehen? 1. Person = Position 0");
        int a = Integer.parseInt(benutzerEingabe.nextLine());

        System.out.println(registeredPersons.get(a).getFirstName() + " " + registeredPersons.get(a).getLastName());
        System.out.println(registeredPersons.get(a).getAge() + " Jahre alt");

        if (eigenerHaushalt = true) {
            System.out.println(registeredPersons.get(a).getStreet());
            System.out.println(registeredPersons.get(a).getPLZ() + " " + registeredPersons.get(a).getCity());

        }

        System.out.println(" ");
        System.out.println("Zurück zum Hauptmenü?");
        System.out.println("Nein = 0");
        System.out.println("Ja = 1");
        int x = Integer.parseInt(benutzerEingabe.nextLine());

        if (x == 1) {
            inputPerson();
        } else
            personendetail();

    }

    public static void personenfinish() {

        System.out.println("Personenregistrierung schliessen:");
        System.out.println("");
        System.out.println("Möchten Sie die Personenregistrierung wirklich schliessen?");
        System.out.println("Nein = 0");
        System.out.println("Ja = 1");
        int a = Integer.parseInt(benutzerEingabe.nextLine());

        if (a == 1) {
            System.out.println("BAY BAY");
            System.exit(1);
        } else
            inputPerson();
    }

    public static void personloopsmal() {

        for (Person registeredPerson : registeredPersons) {
            System.out.println(registeredPerson.getFirstName() + " " + registeredPerson.getLastName());
            System.out.println(registeredPerson.getAge() + " Jahre alt");
            System.out.println(" ");

        }

    }

    public static void personloopbig() {

        for (Person registeredPerson : registeredPersons) {
            System.out.println(registeredPerson.getFirstName() + " " + registeredPerson.getLastName());
            System.out.println(registeredPerson.getAge() + " Jahre alt");
            System.out.println(registeredPerson.getStreet());
            System.out.println(registeredPerson.getPLZ() + " " + registeredPerson.getCity());
            System.out.println(" ");

        }

    }
}
