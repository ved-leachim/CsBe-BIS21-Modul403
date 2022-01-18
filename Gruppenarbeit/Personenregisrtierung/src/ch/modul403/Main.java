package ch.modul403;

import java.util.Scanner;



public class Main {

    public static Person[] registeredPersons = new Person[10];

    public static void main(String[] args) {



        System.out.println("\n#############################################################################\n" +
                "#                                                                           #"+
                "\n#       Guten Tag, willkommen bei der Datenbank für Personenerfassung.      #\n#"+
                ""+
                "                                                                    "+
                "       #\n#                           Was möchten Sie tun?:" +
                "                           #\n#                                                        "+
                "                   #\n"+
                "#          >    Neue Person registrieren                -->   '1'           #\n"
                +"#          >    Alle vorhandenen Personen ausgeben      -->   '2'           #\n"
                +"#          >    Eine Person löschen                     -->   '3'           #\n"
                +"#          >    Details einer Person anzeigen           -->   '4'           #\n"
                +"#       " +
                "   >    Personenregistrierung schliessen        -->   '5'           #\n#"+
                "                                                                           #\n"+
                "#############################################################################\n\n" +
                "Geben Sie Ihre Auswahl ein und bestätigen Sie mit [Enter]:");
        Scanner benutzerEingabe = new Scanner(System.in);
        int UserInput = benutzerEingabe.nextInt();
        if(UserInput==1) {

            public static void registrierung() {

                Person newPerson = new Person();
                newPerson.getFirstName();
                newPerson.getLastName();
                newPerson.getAge();
                newPerson.getHasItsOwnHousehold();
                newPerson.getStreet();
                newPerson.getCity();
                newPerson.getPLZ();

                newPerson.setFirstName(benutzerEingabe.next());
                newPerson.setLastName(benutzerEingabe.next());
                newPerson.setAge(benutzerEingabe.nextInt());
                newPerson.setHasItsOwnHousehold(benutzerEingabe.nextBoolean());
                newPerson.setStreet(benutzerEingabe.next());
                newPerson.setCity(benutzerEingabe.next());
                newPerson.setPLZ(benutzerEingabe.nextInt());
            }




        } else if (UserInput==2){

        } else if (UserInput==3){

        }else if (UserInput==4){

        }else if (UserInput==5){
            System.exit(0);
        }else{
            System.out.println("Bitte treffen Sie eine Auswahl mit den Zahlen zwischen 1 - 5 ein.");
        }


    }
}
