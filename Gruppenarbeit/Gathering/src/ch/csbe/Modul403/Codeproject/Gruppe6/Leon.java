package ch.csbe.Modul403.Codeproject.Gruppe6;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Leon {
    static Scanner userInput;
    static int controlInput;
    static int counter;
    static Person[] registeredPerson;


    public static void main(String[] args) throws InterruptedException {
        startMenu();
        control();
        registerNewPerson();
        showAll();
        exit();
    }

    public static void startMenu() {
        System.out.println("=========================================================================");
        System.out.println("\t\t\t\t\t Willkommen bei der Gathering v. 1.0");
        System.out.println("=========================================================================");
        System.out.println(" ");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Bitte steuern Sie das Program wie folgt:");
        System.out.println("Neue Person registrieren           \t\t\t\t ---> Drücken Sie Taste 1");
        System.out.println("Alle vorhandenen Personen ausgeben \t\t\t\t ---> Drücken Sie Taste 2");
        System.out.println("Eine Person löschen                \t\t\t\t ---> Drücken Sie Taste 3");
        System.out.println("Details einer Person anzeigen      \t\t\t\t ---> Drücken Sie Taste 4");
        System.out.println("Personregistrierung schliessen     \t\t\t\t ---> Drücken Sie Taste 5");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println();
        controlInput = Integer.parseInt(userInput.nextLine());
    }

    public static void control() throws InterruptedException {
        switch (controlInput) {
            case 1: {
                registerNewPerson();
                startMenu(); // von Leon
                controlInput = Integer.parseInt(userInput.nextLine());
            }

            case 2: {
                showAll();
                startMenu();
                controlInput = Integer.parseInt(userInput.nextLine());
            }

            case 5: {
                exit();
                break;
            }

            default: {
                System.err.println("Ungültige Eingabe. Bitte versuchen Sie es erneut.");
                controlInput = Integer.parseInt(userInput.nextLine());
            }
        }
    }

    public static void registerNewPerson() throws InterruptedException {
        if (counter == 10) {
            System.err.println("Sie können keine weiteren Personen erfassen, da die maximale Anzahl erreicht ist.");
        } else {
            System.out.println("Bitte geben Sie den Vornamen an:");
            String fristName = userInput.nextLine();
            System.out.println("Bitte geben Sie den Namen an:");
            String lastname = userInput.nextLine();
            System.out.println("Bitte geben Sie das Alter an:");
            int age = Integer.parseInt(userInput.nextLine());
            System.out.println("Bitte geben Sie an, ob die Person einen eigenen Haushalt führt:");
            System.out.println("(Angabe in Ja / Nein)");
            String stringHasOwnHousehold = userInput.nextLine();
            boolean hasOwnHousehold = false;
            if (stringHasOwnHousehold.contentEquals("Ja") || stringHasOwnHousehold.contentEquals("Wahr")) {
                hasOwnHousehold = true;
            }

            Person newPerson = new Person();
            newPerson.setFirstName(fristName);
            newPerson.setLastName(lastname);
            newPerson.setAge(age);
            newPerson.setHasItsOwnHousehold(hasOwnHousehold);
            if (newPerson.getHasItsOwnHousehold()) {
                System.out.println("Bitte geben Sie die Adresse an:");
                newPerson.setStreet(userInput.nextLine());
                System.out.println("Bitte geben Sie den Wohnort an:");
                newPerson.setCity(userInput.nextLine());
                System.out.println("Bitte geben Sie die PLZ an:");
                newPerson.setPLZ(Integer.parseInt(userInput.nextLine()));
            }

            registeredPerson[counter] = newPerson;
            ++counter;
            System.out.println(MessageFormat.format("Benutzer {0} {1} wurde erfolgreich erstellt.", newPerson.getFirstName(), newPerson.getLastName()));
            System.out.println("-------------------------------------------------------------------------");
            System.out.println(" ");
            Thread.sleep(650);
            System.err.println("Drücken Sie Enter, um zurück zum Startmenü zu gelangen.");
            userInput.nextLine();
            startMenu();
            control();
        }
    }

    public static void showAll() throws InterruptedException {
        int count = 1;
        for (Person reg : registeredPerson) {
            if (reg != null) {
                System.out.println(count++ + ". Eintrag: " + reg.getFirstName() + " " + reg.getLastName());
                System.out.println("-------------------------------------------------------------------------");
            }
        }
        Thread.sleep(650);
        System.err.println("Drücken Sie Enter, um zurück zum Startmenü zu gelangen.");
        userInput.nextLine();
        startMenu();
        control();
    }

    public static void exit() {
        System.err.println("Gathering wird geschlossen.");
        System.exit(0);
    }

    static {
        userInput = new Scanner(System.in);
        registeredPerson = new Person[10];
    }
}

