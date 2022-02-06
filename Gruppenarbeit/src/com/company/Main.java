package Gruppenarbeit.src.com.company;                                                                                  // öffnet die Main.java Datei im Ordner company, welcher ein Unterordner von Gruppenarbeit ist//

import java.util.Arrays;
import java.util.Scanner;

public class Main {                                                                                                     // Main Klasse, welche die Hauptklasse des Programmes ist und in welcher die Befehle ausgeführt werden

    private static final Scanner scanner = new Scanner(System.in);                                                      // initiiert den Scanner namens 'scanner' //
    public static Person[] registeredPersons = new Person[10];                                                          // speichert die Eingaben in der Variable 'registeredPersons' mit dem maximal Wert 10 //
    static int userInput;                                                                                               // speichert eine Variable mit dem Namen 'userInput' //
    static int countRegisteredPerson;
    static int count = 0;                                                                                               // speichert eine Variable mit dem Namen 'count' und dem dazugehörigen Wert 0 //

    public static void main(String[] args) {                                                                            // startet das Hauptprogramm 'main' //
        startProgramm();                                                                                                // initialisiert den Programmabschnitt 'startProgramm' //
        personRegistrierung();                                                                                          // initialisiert den Programmabschnitt 'personRegistrierung' //
        personenAusgabe();                                                                                              // initialisiert den Programmabschnitt 'personenAusgabe' //
        personAusgabe();                                                                                                // initialisiert den Programmabschnitt 'personAusgabe' //
        endeProgramm();                                                                                                 // initialisiert den Programmabschnitt 'endeProgramm' //
    }

    public static void startProgramm() {
        System.out.println("Willkommen beim Registrierungsassistent");
        System.out.println("Manövrieren Sie sich wie folgt durch das Programm:");
        System.out.println("--------------------------------------------------");
        System.out.println("Neue Person registrieren             --> Drücken Sie die Taste '1' ");
        System.out.println("Alle vorhandenen Personen ausgeben   --> Drücken Sie die Taste '2' ");
        System.out.println("Details einer Person ausgeben        --> Drücken Sie die Taste '3' ");
        System.out.println("Personregistrierung schliessen       --> Drücken Sie die Taste '4' ");
        userInput = Integer.parseInt(scanner.nextLine());
        if (userInput == 1) {
            personRegistrierung();
        } else if (userInput == 2) {
            personenAusgabe();
        } else if (userInput == 3) {
            personAusgabe();
        } else if (userInput == 4) {
            endeProgramm();
        } else if (userInput > 4)
            System.out.println("Bitte geben Sie eine der angegeben Zahlen ein. Danke :)");
        System.out.println("=======================================================");

        startProgramm();
    }

    public static void personRegistrierung() {
        Person newPerson = new Person();
        System.out.println("Bitte geben Sie Ihren Vornamen ein:");
        String firstName = scanner.nextLine();
        newPerson.setFirstName(firstName);
        System.out.println("Bitte geben Sie Ihren Nachnamen ein:");
        String secondName = scanner.nextLine();
        newPerson.setLastName(secondName);
        System.out.println("Bitte geben sie Ihr Alter ein:");
        int age = Integer.parseInt(scanner.nextLine());
        newPerson.setAge(age);
        System.out.println("Haben Sie einen eigenen Haushalt:");
        boolean hasItsOwnHousehold = Boolean.parseBoolean(scanner.nextLine());
        newPerson.setHasItsOwnHousehold(hasItsOwnHousehold);
        System.out.println("Bitte geben Sie Ihren Wohnort ein:");
        String city = scanner.nextLine();
        newPerson.setCity(city);
        System.out.println("Geben Sie bitte Ihre Strasse ein:");
        String street = scanner.nextLine();
        newPerson.setStreet(street);
        System.out.println("Bitte geben sie die PLZ ihres Wohnorts ein:");
        int PLZ = Integer.parseInt(scanner.nextLine());
        newPerson.setPLZ(PLZ);

        System.out.println(newPerson.getFirstName() + " wurde erfolgreich gespeichert.");
        System.out.println("----------------------------------------------------------");

        registeredPersons[count] = newPerson;
        Arrays.toString(registeredPersons);
        count++;

        startProgramm();
    }

    public static void personenAusgabe() {
        if (registeredPersons != null) {
            for (int i = 0; i <= count; i++) {
                System.out.println(registeredPersons[i]);
            }
        } else {
            System.out.println("Es wurden noch keine Personen gespeichert.");
            System.out.println("Bitte geben registrieren Sie erst eine Person. :-)");
        }
        startProgramm();
    }

    public static void personAusgabe() {
        System.out.println("Willkommen in der Person-Ausgabe");
        System.out.println("Suche Bei erste Name:");
        String searchFirstName = scanner.nextLine();
        for (int i = 0; i < 9; i++) {
            if (registeredPersons[i]!=null) {
                String test = registeredPersons[i].getFirstName();
                if ( test.equals(searchFirstName)) {
                    System.out.println(registeredPersons[i].getFirstName() + " " + registeredPersons[i].getLastName() + " " +
                            registeredPersons[i].getAge() + " " + registeredPersons[i].getHasItsOwnHousehold() + " " +
                            registeredPersons[i].getStreet() + " " + registeredPersons[i].getCity() + " " + registeredPersons[i].getPLZ());
                    break;
                }
            }
        }
        startProgramm();
    }

    public static void endeProgramm () {
        System.exit(0);
            }
}



