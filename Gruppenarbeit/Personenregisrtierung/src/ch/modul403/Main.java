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
                    + "#          >    Details aller Personen anzeigen           -->   '4'           #\n"
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
                if (hasitsownHoushold.contentEquals("JA"))
                    newPerson.setHasItsOwnHousehold(true);

                else {
                    newPerson.setHasItsOwnHousehold(false);
                }

                System.out.println("Bitte geben sie den Strassennamen und die Nummer ein");

                strasse = benutzerEingabe.nextLine();
                newPerson.setStreet(strasse);

                System.out.println("Bitte geben sie die Stadt ein");

                ort = benutzerEingabe.nextLine();
                newPerson.setCity(ort);

                System.out.println("Bitte geben sie die PLZ ein");

                plz = benutzerEingabe.nextLine();
                newPerson.setPLZ(Integer.parseInt(plz));

                continue;


            } else if (UserInput == 2) {





           /* for(int i = 0; i < registeredPersons.length; i++) {
                System.out.println("Person;" + i + " " + registeredPersons[i].getFirstName() + registeredPersons[i].getLastName());
            }*/



            } else if (UserInput == 3) {

                //Array nachnamen und vornamen anzeigen
                //for(int i = 0; i < registeredPersons.length; i++) {
                //                System.out.println("Person;" + i + " " + registeredPersons[i].getFirstName() + registeredPersons[i].getLastName());


                //Auswahl anbieten über Index welcher gelöscht werden soll
               // System.out.println("Bitte geben sie Ihre Auswahl ein um die Person zu löschen");



                //MIt If/else schlaufe und Userinput ELement löschen

              /* if(UserInput == 0){
                    registeredPersons[0] = null;
                }else if (Userinput ==1){
                    registeredPersons[1] = null;
                }else if (Userinput ==2){
                    registeredPersons[2] = null;
                }else if (Userinput ==3){
                    registeredPersons[3] = null;
                }else if (Userinput ==4){
                    registeredPersons[4] = null;
                }else if (Userinput ==5){
                    registeredPersons[5] = null;
                }else if (Userinput ==6){
                    registeredPersons[6] = null;
                }else if (Userinput ==7){
                    registeredPersons[7] = null;
                }else if (Userinput ==8){
                    registeredPersons[8] = null;
                }else if (Userinput ==9){
                    registeredPersons[9] = null;
                }*/

            } else if (UserInput == 4) {

                System.out.println(Arrays.toString(registeredPersons));



            }
        } while (UserInput != 5);

        // else if (UserInput==5){
        //System.exit(0);
        // }else{
        //System.out.println("Bitte treffen Sie eine Auswahl mit den Zahlen zwischen 1 - 5 ein.");


    }
    }

