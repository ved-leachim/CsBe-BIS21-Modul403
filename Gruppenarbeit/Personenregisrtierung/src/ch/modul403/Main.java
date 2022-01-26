package ch.modul403;

import java.util.Scanner;

import java.util.Arrays;



public class Main {

    public static Person[] registeredPersons = new Person[10];

    public static String hasitsownHoushold;
    public static String vorname;
    public static String nachname;
    public static String alter;
    public static String strasse;
    public static String ort;
    public static String plz;
    public static int registeredPersoncounter = 0;

    public static void main(String[] args) {

        int UserInput;

        System.out.println("\n#############################################################################\n" +
                "#                                                                           #" +
                "\n#       Guten Tag, willkommen bei der Datenbank für Personenerfassung.      #\n#" +
                "" +
                "                                                                    " +
                "       #\n#                           Was möchten Sie tun?:" +
                "                           #\n#                                                        " +
                "                   #\n" +
                "#          >    Neue Person registrieren                -->   '1'           #\n"
                + "#          >    Alle vorhandenen Personen ausgeben      -->   '2'           #\n"
                + "#          >    Eine Person löschen                     -->   '3'           #\n"
                + "#          >    Details einer Person anzeigen           -->   '4'           #\n"
                + "#       " +
                "   >    Personenregistrierung schliessen        -->   '5'           #\n#" +
                "                                                                           #\n" +
                "#############################################################################\n\n");

        do {
            System.out.println("Geben Sie Ihre Auswahl ein und bestätigen Sie mit [Enter]:");

            Scanner benutzerEingabe = new Scanner(System.in);
            UserInput = Integer.parseInt(benutzerEingabe.nextLine());

            if (UserInput == 1) {

                Person newPerson = new Person();

                System.out.println("Bitte geben sie den Vornamen ein");

                vorname = benutzerEingabe.nextLine();
                newPerson.setFirstName(vorname);

                System.out.println("Bitte geben sie den Nachnamen ein");

                nachname = benutzerEingabe.nextLine();
                newPerson.setLastName(nachname);

                System.out.println("Bitte geben sie das Alter ein");

                alter = benutzerEingabe.nextLine();
                newPerson.setAge(Integer.parseInt(alter));

                System.out.println("Haben sie einen eigenen Haushalt? Wenn ja schreiben sie JA, wenn nein dann geben sie NEIN ein");

                hasitsownHoushold = benutzerEingabe.nextLine();
                if (hasitsownHoushold.contentEquals("Nein")) {
                    newPerson.setHasItsOwnHousehold(false);

                    registeredPersons[registeredPersoncounter] = newPerson;
                    registeredPersoncounter++;

                    continue;

                } else if (hasitsownHoushold.contentEquals("Ja")) {
                    newPerson.setHasItsOwnHousehold(true);
                }

                System.out.println("Bitte geben sie den Strassennamen und die Nummer ein");

                strasse = benutzerEingabe.nextLine();
                newPerson.setStreet(strasse);

                System.out.println("Bitte geben sie den Ort ein");

                ort = benutzerEingabe.nextLine();
                newPerson.setCity(ort);

                System.out.println("Bitte geben sie die PLZ ein");

                plz = benutzerEingabe.nextLine();
                newPerson.setPLZ(Integer.parseInt(plz));

                registeredPersons[registeredPersoncounter] = newPerson;
                registeredPersoncounter++;

                continue;


            } else if (UserInput == 2) {

                for (int i = 0; i < registeredPersons.length; i++)
                    System.out.println(
                            registeredPersons[i].getFirstName() + "   "
                                    + registeredPersons[i].getLastName());


            } else if (UserInput == 3) {

                //Array nachnamen und vornamen anzeigen
                for (int i = 0; i < registeredPersons.length; i++)
                    System.out.println(i + ":" + "     " +
                            registeredPersons[i].getFirstName() + "   "
                            + registeredPersons[i].getLastName());

                //Auswahl anbieten über Index welcher gelöscht werden soll
                System.out.println("Bitte geben sie Ihre Auswahl ein um die Person zu löschen");
                UserInput = Integer.parseInt(benutzerEingabe.nextLine());

                //MIt If/else schlaufe und Userinput ELement löschen
                if (UserInput == 0) {
                    registeredPersons[0] = null;
                } else if (UserInput == 1) {
                    registeredPersons[1] = null;
                } else if (UserInput == 2) {
                    registeredPersons[2] = null;
                } else if (UserInput == 3) {
                    registeredPersons[3] = null;
                } else if (UserInput == 4) {
                    registeredPersons[4] = null;
                } else if (UserInput == 5) {
                    registeredPersons[5] = null;
                } else if (UserInput == 6) {
                    registeredPersons[6] = null;
                } else if (UserInput == 7) {
                    registeredPersons[7] = null;
                } else if (UserInput == 8) {
                    registeredPersons[8] = null;
                } else if (UserInput == 9) {
                    registeredPersons[9] = null;
                }

                continue;


            } else if (UserInput == 4) {

                //Auswahl anbieten über Index welcher eingesehen werden will
                for (int i = 0; i < registeredPersons.length; i++)
                    System.out.println(i + ":" + "     " +
                            registeredPersons[i].getFirstName() + "   "
                            + registeredPersons[i].getLastName());
                System.out.println("Bitte geben sie an von welcher Person sie die Details sehen wollen");


                //mit if / else schlaufe und INdex auswahl Details anzeigen lassen

                if (UserInput == 0) {

                    System.out.println(
                            registeredPersons[0].getFirstName() + "   "
                                    + registeredPersons[0].getLastName() + "   "
                                    + registeredPersons[0].getAge() + "   "
                                    + registeredPersons[0].getHasItsOwnHousehold() + "   "
                                    + registeredPersons[0].getStreet() + "   "
                                    + registeredPersons[0].getCity() + "   "
                                    + registeredPersons[0].getPLZ());

                } else if (UserInput == 1) {

                    System.out.println(
                            registeredPersons[1].getFirstName() + "   "
                                    + registeredPersons[1].getLastName() + "   "
                                    + registeredPersons[1].getAge() + "   "
                                    + registeredPersons[1].getHasItsOwnHousehold() + "   "
                                    + registeredPersons[1].getStreet() + "   "
                                    + registeredPersons[1].getCity() + "   "
                                    + registeredPersons[1].getPLZ());

                } else if (UserInput == 2) {

                    System.out.println(
                            registeredPersons[2].getFirstName() + "   "
                                    + registeredPersons[2].getLastName() + "   "
                                    + registeredPersons[2].getAge() + "   "
                                    + registeredPersons[2].getHasItsOwnHousehold() + "   "
                                    + registeredPersons[2].getStreet() + "   "
                                    + registeredPersons[2].getCity() + "   "
                                    + registeredPersons[2].getPLZ());

                } else if (UserInput == 3) {

                    System.out.println(
                            registeredPersons[3].getFirstName() + "   "
                                    + registeredPersons[3].getLastName() + "   "
                                    + registeredPersons[3].getAge() + "   "
                                    + registeredPersons[3].getHasItsOwnHousehold() + "   "
                                    + registeredPersons[3].getStreet() + "   "
                                    + registeredPersons[3].getCity() + "   "
                                    + registeredPersons[3].getPLZ());

                } else if (UserInput == 4) {

                    System.out.println(
                            registeredPersons[4].getFirstName() + "   "
                                    + registeredPersons[4].getLastName() + "   "
                                    + registeredPersons[4].getAge() + "   "
                                    + registeredPersons[4].getHasItsOwnHousehold() + "   "
                                    + registeredPersons[4].getStreet() + "   "
                                    + registeredPersons[4].getCity() + "   "
                                    + registeredPersons[4].getPLZ());

                } else if (UserInput == 5) {

                    System.out.println(
                            registeredPersons[5].getFirstName() + "   "
                                    + registeredPersons[5].getLastName() + "   "
                                    + registeredPersons[5].getAge() + "   "
                                    + registeredPersons[5].getHasItsOwnHousehold() + "   "
                                    + registeredPersons[5].getStreet() + "   "
                                    + registeredPersons[5].getCity() + "   "
                                    + registeredPersons[5].getPLZ());

                } else if (UserInput == 6) {

                    System.out.println(
                            registeredPersons[6].getFirstName() + "   "
                                    + registeredPersons[6].getLastName() + "   "
                                    + registeredPersons[6].getAge() + "   "
                                    + registeredPersons[6].getHasItsOwnHousehold() + "   "
                                    + registeredPersons[6].getStreet() + "   "
                                    + registeredPersons[6].getCity() + "   "
                                    + registeredPersons[6].getPLZ());

                } else if (UserInput == 7) {

                    System.out.println(
                            registeredPersons[7].getFirstName() + "   "
                                    + registeredPersons[7].getLastName() + "   "
                                    + registeredPersons[7].getAge() + "   "
                                    + registeredPersons[7].getHasItsOwnHousehold() + "   "
                                    + registeredPersons[7].getStreet() + "   "
                                    + registeredPersons[7].getCity() + "   "
                                    + registeredPersons[7].getPLZ());

                } else if (UserInput == 8) {

                    System.out.println(
                            registeredPersons[8].getFirstName() + "   "
                                    + registeredPersons[8].getLastName() + "   "
                                    + registeredPersons[8].getAge() + "   "
                                    + registeredPersons[8].getHasItsOwnHousehold() + "   "
                                    + registeredPersons[8].getStreet() + "   "
                                    + registeredPersons[8].getCity() + "   "
                                    + registeredPersons[8].getPLZ());

                } else if (UserInput == 9) {

                    System.out.println(
                            registeredPersons[9].getFirstName() + "   "
                                    + registeredPersons[9].getLastName() + "   "
                                    + registeredPersons[9].getAge() + "   "
                                    + registeredPersons[9].getHasItsOwnHousehold() + "   "
                                    + registeredPersons[9].getStreet() + "   "
                                    + registeredPersons[9].getCity() + "   "
                                    + registeredPersons[9].getPLZ());


                }continue;
            }
        }
            while (UserInput != 5) ;

        }

    }