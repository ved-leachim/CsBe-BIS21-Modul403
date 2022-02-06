package Gruppenarbeit.Lb2;

import java.util.Scanner;


public class personalRegistration {
    static Scanner userInput = new Scanner(System.in);
    public static Person[] registeredPersons = new Person[10];

    public static void main(String[] args) {
        greeting();
        navigation();
    }

    public static void navigation() {
        System.out.println("Mit der Eingabe 1 gelangen sie zur Registrierung");
        System.out.println("Mit der Eingabe 2 gelangen sie zur Anzeige der Registrierten Personen");
        System.out.println("Zum beenden des Programms geben sie die nummer 9 ein");
        System.out.println("------------------------------------------------------------");
        System.out.println("Bitte wählen sie aus mit was sie fortfharen wollen");

        int input = userInput.nextInt();
        if (input == 1) {
            registerPersons();
        } else if (input == 2) {
            displayPersons();
        } else if (input == 9) {
            System.exit(0);
        } else {
            navigation();
        }
    }

    public static void greeting() {
        System.out.println("------------------------------------------------------------");
        System.out.println("Willkommen Bei der Registrierungs Applikation der BIS 21");
        System.out.println("------------------------------------------------------------");
        System.out.println("Mit der Eingabe von Zahlen Navigieren sie durch unser Programm");
    }

    public static void registerPersons() {
        for (int i = 0; i <= 9; i++) {
            registerPerson(i);
        }
        navigation();
    }

    public static void registerPerson(Integer index) {
        //User Input
        Person p = new Person();
        System.out.println("Bitte geben sie den Vornamen ein");
        String firstName = userInput.next();
        p.setFirstName(firstName);

        System.out.println("Bitte geben sie den Nachnamen");
        String lastName = userInput.next();
        p.setLastName(lastName);

        System.out.println("Bitte geben sie das Alter der Person an");
        int age = userInput.nextInt();
        p.setAge(age);

        System.out.println("Ist die Person Alleinstehend");
        String bol = userInput.next();
        if ("ja".equals(bol.trim().toLowerCase())) {
            p.setHasItsOwnHousehold(true);

            System.out.println("In welcher Strasse Wohnt die Person");
            String street = userInput.next();
            p.setStreet(street);

            System.out.println("In welcher Stadt wohnt die Person");
            String city = userInput.next();
            p.setCity(city);

            System.out.println("Bitte geben sie die Postlehizahl der Person an");
            int plz = userInput.nextInt();
            p.setPLZ(plz);

        } else {
            p.setHasItsOwnHousehold(false);
        }
        registeredPersons[index] = p;
    }

    public static void displayPersons() {
        try {
            for (Person p : registeredPersons) {
                System.out.println("Vorname : " + p.getFirstName());
                System.out.println("Nachname : " + p.getLastName());
                System.out.println("Alter : " + p.getAge());
                if (p.getHasItsOwnHousehold()) {
                    System.out.println("Wohnt an folgender Adresse:");
                    System.out.println("Strasse : " + p.getStreet());
                    System.out.println("Stadt : " + p.getCity());
                    System.out.println("PLZ : " + p.getPLZ());
                    System.out.println(" ");
                    System.out.println(" ");
                } else {
                    System.out.println("Die Person ist nicht Alleinestehnend");
                    System.out.println(" ");
                    System.out.println(" ");
                }
            }
        } catch (Exception e) {
            System.out.println("Sie werden wieder zur Navigation geleitet");
            System.out.println(" ");
            System.out.println(" ");
        }
        navigation();
    }
}

