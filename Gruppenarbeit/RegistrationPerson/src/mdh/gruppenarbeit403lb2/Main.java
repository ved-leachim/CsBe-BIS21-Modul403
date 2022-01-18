package mdh.gruppenarbeit403lb2;

import javax.lang.model.element.Name;
import java.util.Scanner;
import java.text.MessageFormat;
import java.awt.event.*;

public class Main {

    static Scanner userInput = new Scanner(System.in);
    static char controlInput;
    static int counter;
    static Person[] newPerson = new Person[10];

    public static void main(String[] args) {
        welcome();
        mainMenu();
        control();
        regNewPerson();
        personList();
        personDelete();
        personDetails();
        programFinish();
    }

    public static void welcome() {
        System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
        System.out.println("Willkommen zur Personenregistrierung");
        System.out.println("Bitte folgen Sie den nachfolgenden Anweisungen.");
        System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
    }

    public static void mainMenu(){
        System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
        System.out.println("Steuern Sie das Program wie folgt:");
        System.out.println("Eine Neue Person erfassen            \uD83E\uDC7A Drücken Sie die Taste  `R`  \uD83E\uDC78");
        System.out.println("Alle Personen ausgeben               \uD83E\uDC7A Drücken Sie die Taste  `A`  \uD83E\uDC78");
        System.out.println("Eine Person löschen                  \uD83E\uDC7A Drücken Sie die Taste  `D`  \uD83E\uDC78");
        System.out.println("Details zu einer Person anzeigen     \uD83E\uDC7A Drücken Sie die Taste  `M`  \uD83E\uDC78");
        System.out.println("Program Beenden                      \uD83E\uDC7A Drücken Sie die Taste  `E` \uD83E\uDC78");
        System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
    }

    public static void control(){
        switch (controlInput){
            case 'R':
                regNewPerson();
                break;
            case 'A':
                personList();
                break;
            case 'D':
                personDelete();
                break;
            case 'M':
                personDetails();
                break;
            case 'E':
                programFinish();
                break;
        }
    }

    public static void regNewPerson(){
        if (counter == 10){
            System.out.println("Es können nur 10 Personen erfasst werden.");
        }else {
            System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
            System.out.println("Geben Sie den Vornamen ein:");
            String firstName = userInput.nextLine();
            System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
            System.out.println("Geben Sie den Nachnamen ein:");
            String lastName = userInput.nextLine();
            System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
            System.out.println("Geben Sie das Alter ein:");
            int age = userInput.nextInt();
            System.out.println("――――――――――――――――――――――――――――――――――――――――――――");
            System.out.println("Führt die Person einen eigenen Haushalt :");
            String stringHasItsOwnHousehold = userInput.nextLine();
            boolean hasItsOwnHousehold = true;

            //if (stringHasItsOwnHousehold.




        }

    }

    public static void personList(){

    }

    public static void personDelete(){

    }

    public static void personDetails(){

    }

    public static void programFinish(){

    }

}