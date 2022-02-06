package mdh.gruppenarbeit403lb2;

import java.util.Scanner;
import java.text.MessageFormat;


public class Main {

    static Scanner userInput = new Scanner(System.in);
    static int controlInput;
    static int counter;
    static Person[] registeredPerson = new Person[10];

    public static void main(String[] args) {
        welcome();
        control();
        mainMenu();
        regNewPerson();
        personList();
        programFinish();
    }

    public static void welcome() {
        System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
        System.out.println("Willkommen zur Personenregistrierung");
        System.out.println("Bitte folgen Sie den nachfolgenden Anweisungen.");
        System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
    }

    public static void control() {
        mainMenu();
        controlInput = Integer.parseInt(userInput.nextLine());
        switch (controlInput) {
            case 1:
                System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
                System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
                System.out.println("Sie haben: Eine Neue Person erfassen gewählt.");
                regNewPerson();
                break;

            case 2:
                System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
                System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
                System.out.println("Sie haben: Alle Personen ausgeben gewählt.");
                personList();
                break;

            case 3:
                System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
                System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
                System.out.println("Sie haben: Program Beenden gewählt.");
                programFinish();
                break;

            default:
                System.out.println("Die Taste die Sie gedrückt haben, wird nicht Verwendet.");
                control();
        }

    }


    public static void mainMenu(){
        System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
        System.out.println("Steuern Sie das Program wie folgt:");
        System.out.println("Eine Neue Person erfassen            \uD83E\uDC7A  Drücken Sie die Taste  1  \uD83E\uDC78");
        System.out.println("Alle Personen ausgeben               \uD83E\uDC7A  Drücken Sie die Taste  2  \uD83E\uDC78");
        System.out.println("Program Beenden                      \uD83E\uDC7A  Drücken Sie die Taste  3  \uD83E\uDC78");
        System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
    }


    public static void regNewPerson(){
        if (counter == 10){
            System.out.println("Es können nur 10 Personen erfasst werden.");
        }

        else {
            System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
            System.out.println("Geben Sie den Vornamen ein:");
            String getFirstName = userInput.nextLine();
            System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
            System.out.println("Geben Sie den Nachnamen ein:");
            String getLastName = userInput.nextLine();
            System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
            System.out.println("Geben Sie das Alter ein:");
            int getAge = Integer.parseInt(userInput.nextLine());
            System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
            System.out.println("Führt die Person einen eigenen Haushalt:");
            String getHasItsOwnHousehold = userInput.nextLine();
            boolean hasItsOwnHousehold;

            hasItsOwnHousehold = getHasItsOwnHousehold.contentEquals("Ja") || getHasItsOwnHousehold.contentEquals("Wahr") ||
                    getHasItsOwnHousehold.contentEquals("ja");

            Person newPerson = new Person();
            newPerson.setFirstName(getFirstName);
            newPerson.setLastName(getLastName);
            newPerson.setAge(getAge);
            newPerson.setHasItsOwnHousehold(hasItsOwnHousehold);

            if (newPerson.getHasItsOwnHousehold()){
                System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
                System.out.println("Geben Sie die Adresse ein:");
                newPerson.setStreet(userInput.nextLine());
                System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
                System.out.println("Geben Sie den Wohnort ein:");
                newPerson.setCity(userInput.nextLine());
                System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
                System.out.println("Geben Sie eine PLZ ein:");
                newPerson.setPLZ(Integer.parseInt(userInput.nextLine()));
            }

            registeredPerson[counter] = newPerson; counter++;

            System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
            System.out.println(MessageFormat.format("Person {0} {1} wurde erfolgreich erstellt", newPerson.getFirstName(), newPerson.getLastName()));
            System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
        }

        control(); 

    }

    public static void personList(){
        if (counter == 0){
            System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
            System.out.println("Es sind bis jetzt noch keine Personen erfasst worden.");
            control();
        }

        for( int i = 0 ;i<=counter; i++){
            System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
            System.out.println(registeredPerson[i].getFirstName()+" "+registeredPerson[i].getLastName()+" "+registeredPerson[i].getAge());
        }

        control();
    }

    public static void programFinish(){
        System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
        System.out.println("Auf Wiedersehen bis zum nächsten mal.");
        System.exit(0);
    }

}
