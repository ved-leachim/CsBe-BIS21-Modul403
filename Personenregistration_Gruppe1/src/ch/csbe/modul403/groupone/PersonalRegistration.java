package ch.csbe.modul403.groupone;

import java.text.MessageFormat;
import java.util.Scanner;
import java.util.Objects; // für Variante 2

public class PersonalRegistration {

    static int personCounter; // dies ist der Counter für die registrierten Personen, dieser wird in Zeile 159 / 160 verwendet und zusätzlich in Zeile 83 für die If-Anweisung
    static int inputGreeting; // die verschiedenen Inputs sind nur zu Übungszwecken
    static int inputMenu;
    static int inputRegisterNewPerson;
    static int inputPrintRegisteredPersons;
    static int inputPrintPersonDetails;
    static int inputProgrammEndeAuffangen;
    static Scanner userInput = new Scanner(System.in); // Scanner mit dem Namen "userInput" wird erzeugt, um die Eingabe(System in) zu scannen
    static Person[] registeredPerson = new Person[10]; // Die [] Klammern definieren in JAVA ein Array. Wir erzeugen das Array "registeredPerson", dieses wirt mit Werten vom Typ Person befüllt (Public Class Person)

    // Quellenangaben

    // nextInt Buffer-Problem:                     https://www.youtube.com/watch?v=_xqzmDyLWvs&ab_channel=KirstenMarkley
    // Array:                                      https://www.w3schools.com/java/java_arrays.asp und https://www.javatpoint.com/array-in-java
    // Switch Case:                                https://studyflix.de/informatik/switch-case-java-1804
    // Schleifen:                                  https://www.java-tutorial.org/schleifen.html
    // erweiterte for-Schleife (foreach):          https://www.youtube.com/watch?v=sBvMAe-JMqI&ab_channel=OppaHansi
    // java.util.Objects (Variante 2):             https://www.tabnine.com/code/java/methods/java.util.Objects/equals
    // if-Anweisung:                               https://studyflix.de/informatik/if-anweisung-220 und https://www.java-programmieren.com/if-anweisung-java.php
    // MessageFormat:                              http://www.tutego.de/java/articles/Ausgaben-MessageFormat-formatieren.html

    public static void main(String[] args) {

        greeting();
        programmEndeAuffangen();
        //tryCatch(); // als Test
        //while(); // als Test

    }

    public static void greeting() {

        System.out.println("*********************************************************************");
        System.out.println("*   Willkommen bei der Personenregistrierung   v 1.0                *");
        System.out.println("*                                                                   *");
        System.out.println("*   created by Daniel Ruedisuehli, Michel Lutz, Michael Fankhauser  *");
        System.out.println("*********************************************************************");
        System.out.println("Menü einblenden:                           Taste:   - 1 -");

        inputGreeting = (userInput.nextInt());
        // für Variante 2
        // inputGreeting = Integer.parseInt(userInput.nextInt()); //String zu Integer

        if (inputGreeting == 1) {
            menu();
            //System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n");   //für automatische Anpassung an Console
        } else {
            System.out.println("Eingabewert ungültig!");
        }
        programmEndeAuffangen();

        /*
        // Variante 2
        inputGreeting = Integer.parseInt(userInput.nextLine());
        if (Objects.equals(inputGreeting, 1)) {
        */

        /*
        // Variante 3
        switch (inputGreeting){
            case 1 -> menu();
            default -> System.out.println("Eingabewert ungültig!");
        }
        */
    }

    public static void menu() {

        System.out.println("*********************************************************************");
        System.out.println("Programmsteuerung:");
        System.out.println("Neue Person registrieren                   Taste:   - 1 -");
        System.out.println("Vorhandene Personen ausgeben               Taste:   - 2 -");
        System.out.println("Details einer Personen ausgeben            Taste:   - 3 -"); // aus Zeitgründen noch im Betastadium
        System.out.println("Programm schliessen                        Taste:   - 4 -");
        //System.out.println("\n\n\n"); //für automatische Anpassung an Console

        inputMenu = (userInput.nextInt());
        if (inputMenu == 1) {
            registerNewPerson();
        }
        if (inputMenu == 2) {
            printRegisteredPersons();
        }
        if (inputMenu == 3) {
            printPersonDetails();
        }
        if (inputMenu == 4) {
            closeProgram();
        }
        programmEndeAuffangen();
    }

    private static void registerNewPerson() {

        if (personCounter == 10) { // if-Anweisung für das 10 Personen-maximum des Arrays
            System.out.println("*********************************************************************");
            System.out.println("\t   >>> Die maximale Anzahl von Personen wurde erfasst <<<");
            System.out.println("*********************************************************************");
            System.out.println("Vorhandene Personen ausgeben               Taste:   - 1 -");
            System.out.println("Programm schliessen                        Taste:   - 2 -");
            //System.out.println("\n\n\n\n"); //für automatische Anpassung an Console
            System.out.println("*********************************************************************");

            inputRegisterNewPerson =(userInput.nextInt());

            if (inputRegisterNewPerson == 1) {
                printRegisteredPersons();
            }
            if (inputRegisterNewPerson == 2) {
                closeProgram();
            }
            else {
                programmEndeAuffangen();
            }

        } else {

            //System.out.println("\n\n\n\n\n"); //für automatische Anpassung an Console
            System.out.println("*********************************************************************");
            System.out.println("Personenregistrierung");
            System.out.println("*********************************************************************");
            //System.out.println("\n\n\n\n\n"); //für automatische Anpassung an Console

            userInput.nextLine(); // wird hinzugefügt, damit das \n im Buffer aufgebraucht wird
            System.out.println("Bitte geben Sie den Vornamen an:");
            String firstName = userInput.nextLine();
            System.out.println("*********************************************************************");
            //System.out.println("\n\n\n\n\n\n\n\n"); //für automatische Anpassung an Console

            System.out.println("Bitte geben Sie den Nachnamen an:");
            String lastName = userInput.nextLine();
            System.out.println("*********************************************************************");
            //System.out.println("\n\n\n\n\n\n\n\n"); //für automatische Anpassung an Console

            System.out.println("Bitte geben Sie das Alter an:");
            int age = Integer.parseInt(userInput.nextLine());
            System.out.println("*********************************************************************");
            //System.out.println("\n\n\n\n\n\n\n\n"); //für automatische Anpassung an Console

            System.out.println("Führt die Person einen eigenen Haushalt?:");
            String stringHasOwnHousehold = userInput.nextLine();
            //System.out.println("*********************************************************************");
            //System.out.println("\n\n\n\n\n\n\n\n"); //für automatische Anpassung an Console
            boolean hasOwnHousehold = false;

            if (stringHasOwnHousehold.contentEquals("Ja") || stringHasOwnHousehold.contentEquals("ja") ||
                stringHasOwnHousehold.contentEquals("Yes") || stringHasOwnHousehold.contentEquals("yes") ||
                stringHasOwnHousehold.contentEquals("Klar")  || stringHasOwnHousehold.contentEquals("klar")) {
                hasOwnHousehold = true;
            }

            Person newPerson = new Person(); // neue Person von Typ Person wird erstellt
            newPerson.setFirstName(firstName); // oben definierter Wert zu firstName wird der erstellten Person via Setter Funktion zugewiesen
            newPerson.setLastName(lastName);
            newPerson.setAge(age);
            newPerson.setHasItsOwnHousehold(hasOwnHousehold);

            if (newPerson.getHasItsOwnHousehold()) {
                System.out.println("Bitte geben sie die Strasse und Hausnummer an:");
                newPerson.setStreet(userInput.nextLine());
                System.out.println("*********************************************************************");
                //System.out.println("\n\n\n\n\n\n\n\n"); //für automatische Anpassung an Console

                System.out.println("Bitte geben sie den Wohnort an:");
                newPerson.setCity(userInput.nextLine());
                System.out.println("*********************************************************************");
                //System.out.println("\n\n\n\n\n\n\n\n"); //für automatische Anpassung an Console

                System.out.println("Bitte geben sie die PLZ an:");
                newPerson.setPLZ(Integer.parseInt(userInput.nextLine()));
                //System.out.println("\n\n\n\n\n\n"); //für automatische Anpassung an Console
            }

            registeredPerson[personCounter] = newPerson; // speichert newPerson ins Array registeredPerson und zählt den personCounter +1
            personCounter++;

            System.out.println("*********************************************************************");
            System.out.println(MessageFormat.format(">>> {0} {1} wurde erfolgreich registriert! <<<", newPerson.getFirstName(), newPerson.getLastName()));
            System.out.println("*********************************************************************");
            System.out.println("Zurück zum Menü                            Taste:   - 1 -");

            inputRegisterNewPerson = (userInput.nextInt());

            if (inputRegisterNewPerson == 1) {
                menu();
            } else {
                System.out.println("Eingabewert ungültig");
                programmEndeAuffangen();
            }
        }
    }

    public static void printRegisteredPersons() {

        System.out.println("*********************************************************************");
        System.out.println("Folgende Personen sind bereits registriert:");

        for (Person arrayValue : registeredPerson) { // Datentyp / Objekt Person, Variable : Array
            if (arrayValue != null) { // wenn eine Person vorhanden ist, diese ausgeben
                System.out.println(arrayValue.getFirstName() + " " + arrayValue.getLastName());
            }
            if (arrayValue == null ){
                System.out.println("\n");
                System.out.println("\t\t\t  >>> Kein weiterer Eintrag vorhanden! <<<");
                break; // damit die for-Schleife stoppt und unser String somit nicht 10x ausgegeben wird
            }
        }

        //System.out.println("kein Eintrag vorhanden!");
        System.out.println("*********************************************************************");
        System.out.println("Zurück zum Menü                            Taste:   - 1 -");

        inputPrintRegisteredPersons = (userInput.nextInt());

        if (inputPrintRegisteredPersons == 1) {
            menu();
        }
        programmEndeAuffangen();
    }

    public static void printPersonDetails() { // aus Zeitgründen noch im Betastadium

        System.out.println("*********************************************************************");
        System.out.println("Für die Auswahl der Person              Eingabe: 1 - 10");

        inputPrintPersonDetails = (userInput.nextInt());

        switch (inputPrintPersonDetails){
            case 1 -> System.out.println(MessageFormat.format("{0} {1} ist {2} Jahre alt und wohnt in {5} {4} an der {3}",
                    registeredPerson[0].getFirstName(), registeredPerson[0].getLastName(), registeredPerson[0].getAge(), registeredPerson[0].getStreet(), registeredPerson[0].getCity(), registeredPerson[0].getPLZ()));

            case 2 -> System.out.println(MessageFormat.format("{0} {1} ist {2} Jahre alt und wohnt in {5} {4} an der {3}",
                    registeredPerson[1].getFirstName(), registeredPerson[1].getLastName(), registeredPerson[1].getAge(), registeredPerson[1].getStreet(), registeredPerson[1].getCity(), registeredPerson[1].getPLZ()));

            case 3 -> System.out.println(MessageFormat.format("{0} {1} ist {2} Jahre alt und wohnt in {5} {4} an der {3}",
                    registeredPerson[2].getFirstName(), registeredPerson[2].getLastName(), registeredPerson[2].getAge(), registeredPerson[2].getStreet(), registeredPerson[2].getCity(), registeredPerson[2].getPLZ()));

            case 4 -> System.out.println(MessageFormat.format("{0} {1} ist {2} Jahre alt und wohnt in {5} {4} an der {3}",
                    registeredPerson[3].getFirstName(), registeredPerson[3].getLastName(), registeredPerson[3].getAge(), registeredPerson[3].getStreet(), registeredPerson[3].getCity(), registeredPerson[3].getPLZ()));

            case 5 -> System.out.println(MessageFormat.format("{0} {1} ist {2} Jahre alt und wohnt in {5} {4} an der {3}",
                    registeredPerson[4].getFirstName(), registeredPerson[4].getLastName(), registeredPerson[4].getAge(), registeredPerson[4].getStreet(), registeredPerson[4].getCity(), registeredPerson[4].getPLZ()));

            case 6 -> System.out.println(MessageFormat.format("{0} {1} ist {2} Jahre alt und wohnt in {5} {4} an der {3}",
                    registeredPerson[5].getFirstName(), registeredPerson[5].getLastName(), registeredPerson[5].getAge(), registeredPerson[5].getStreet(), registeredPerson[5].getCity(), registeredPerson[5].getPLZ()));

            case 7 -> System.out.println(MessageFormat.format("{0} {1} ist {2} Jahre alt und wohnt in {5} {4} an der {3}",
                    registeredPerson[6].getFirstName(), registeredPerson[6].getLastName(), registeredPerson[6].getAge(), registeredPerson[6].getStreet(), registeredPerson[6].getCity(), registeredPerson[6].getPLZ()));

            case 8 -> System.out.println(MessageFormat.format("{0} {1} ist {2} Jahre alt und wohnt in {5} {4} an der {3}",
                    registeredPerson[7].getFirstName(), registeredPerson[7].getLastName(), registeredPerson[7].getAge(), registeredPerson[7].getStreet(), registeredPerson[7].getCity(), registeredPerson[7].getPLZ()));

            case 9 -> System.out.println(MessageFormat.format("{0} {1} ist {2} Jahre alt und wohnt in {5} {4} an der {3}",
                    registeredPerson[8].getFirstName(), registeredPerson[8].getLastName(), registeredPerson[8].getAge(), registeredPerson[8].getStreet(), registeredPerson[8].getCity(), registeredPerson[8].getPLZ()));

            case 10 -> System.out.println(MessageFormat.format("{0} {1} ist {2} Jahre alt und wohnt in {5} {4} an der {3}",
                    registeredPerson[9].getFirstName(), registeredPerson[9].getLastName(), registeredPerson[9].getAge(), registeredPerson[9].getStreet(), registeredPerson[9].getCity(), registeredPerson[9].getPLZ()));

            default -> System.out.println("Eingabewert ungültig!");
        }
        System.out.println("*********************************************************************");
        System.out.println("Zurück zum Menü                            Taste:   - 1 -");

        inputPrintPersonDetails = (userInput.nextInt());

        if (inputPrintPersonDetails == 1) {
            menu();
        }
        programmEndeAuffangen();
    }

    public static void closeProgram() {

        System.out.println("Programm wurde beendet.");
        System.exit(0); // schliesst das Programm

    }

    public static void programmEndeAuffangen() {

        System.out.println("Irgendetwas ist schief gelaufen, versuche es nochmal! :)");
        System.out.println("Zurück zum Menü                            Taste:   - 1 -");

        inputProgrammEndeAuffangen = (userInput.nextInt());
        if (inputPrintRegisteredPersons == 1) {
            menu();
        }
        System.out.println("Hahaha Notlösung :)");
        menu();
    }
}
    /*
    public static void while() {
        inputRegisterNewPerson = Integer.parseInt(userInput.next());

        while (!(inputRegisterNewPerson == 1 || inputRegisterNewPerson == 2)) {
            System.out.println("bla");
            inputRegisterNewPerson = userInput.nextInt();

        }
    }

    public static void tryCatch() {
        int number = 0;
        while (number != 1){
            System.out.println("Eingabewert ungültig!");

            try {
                number = Integer.parseInt(userInput.next());


            }
            catch (NumberFormatException e) {
                System.out.println("Es ist ein Fehler aufgetreten");


            }
        }
    }
     */

