package Zeichenfolge;

 import javax.swing.*;
 import java.text.MessageFormat;
 import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        // boolean declaration.
        boolean hasItsOwnHousehold;
        boolean dataB;
        boolean dataBFirst;
        boolean dataBSecond;
        boolean arrayBoolean = false;

        // a declaration for the array.
        int a = 0;


        // Creation of a multidimensional array, with MAX 10 Persons.
        String [][] registeredPersons = new String[10][6];


        // Greeting.
        System.out.println("---------------------------------------------------------------");
        System.out.println("Welcome to our first Java Project! We hope you will like it. =)");
        System.out.println("---------------------------------------------------------------");


        // Here you will be asked whether you want to see the date or not.
        System.out.println("This is the main menu, what you want to do?");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Press -y- to see the person data, press -d- to start entering your data or close this program.");
        System.out.println("----------------------------------------------------------------------------------------------");
        String seeDataFirst = scan.nextLine();


        // The if for checking whether seeData is y.
        if (seeDataFirst.contentEquals("y")) {
            dataBFirst = true;
        }else{
            dataBFirst = false;
        };


        // if dataB is true then the multi-dimensional array is output with the for loop.
        if (dataBFirst == true) {
            for(int i = 0; i < registeredPersons.length; i++) {
                for(int j = 0; j < registeredPersons[i].length; j++) {
                    System.out.print(registeredPersons[i][j] + " ");
                };
                System.out.println();
            }};


            System.out.println("Do you want enter your data?(press -y-) or do you want close this program?(press -n-)");
            String seeDataSecond = scan.nextLine();


         // The if for checking whether data is y.
         if (seeDataSecond.contentEquals("y")) {
             dataBSecond = true;
         }else {
             dataBSecond = false;
         };


        // This is the while for entering more datas.
         while (dataBSecond == true) {


             // This is the function to check if you have already added 10 persons.
             if(a >= 9) {
                 System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                 System.out.println("You have reached the maximum number of possible entries, unfortunately we haven't had enough time to add a delete function yet," +
                         " but that will surely be added with the next updated. Stay tuned. ;-)");
                 System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");


                 // Here says the program goodbye.
                 System.out.println("-----------------------------------------------------------------------");
                 System.out.println("We Hope you were satisfied with our program and wish you a nice day. =)");
                 System.out.println("-----------------------------------------------------------------------");
                 System.exit(0);
             };


             // This if is there to count the variable a +1 with each new run,
             // so that you can make a new entry in the multidimensional array.
             if (arrayBoolean == true) {
                 a++;
             }


        // Entry of personal data.
        System.out.println("Enter your first Name.");
        registeredPersons[a][0] = scan.nextLine();

        System.out.println("Enter your last Name.");
        registeredPersons[a][1] = scan.nextLine();

        System.out.println("Enter your Age.");
        registeredPersons[a][2] = scan.nextLine();


        // Here will be asked whether you run your own Household.
        System.out.println("Lead your on Household? y/n?");
        String yesOrNo = scan.nextLine();

        if (yesOrNo.contentEquals("y")) {
            hasItsOwnHousehold = true;
        }else{
            hasItsOwnHousehold = false;
        };


        // Here it is checked whether the boolean is true.
        if (hasItsOwnHousehold == true) {
            System.out.println("Enter your Street.");
            registeredPersons[a][3] = scan.nextLine();


            System.out.println("Enter your PLZ.");
            registeredPersons[a][4] = scan.nextLine();


            System.out.println("Enter your City.");
            registeredPersons[a][5] = scan.nextLine();
        }
        else
            // Here you will be asked whether you want to see the date or not.
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Do you want to see the personal data or do you want to enter more data? ");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("-y- for see the data, -n- for enter more data.");
            System.out.println("------------------------------------------------------------------------");
            String seeData = scan.nextLine();



        // The if for checking whether seeData is y.
        if (seeData.contentEquals("y")) {
            dataB = true;
        }else{
            dataB = false;
            arrayBoolean = true;
        };


        // If dataB is true then the multi-dimensional array is output with the for loop.
        if (dataB == true) {
            for(int i = 0; i < registeredPersons.length; i++) {
                for(int j = 0; j < registeredPersons[i].length; j++) {
                    System.out.print(registeredPersons[i][j] + " ");
                };
                System.out.println();
            };
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.println("Do you want add more data press -y-, when you when you want to leave this program press -n-.");
            System.out.println("--------------------------------------------------------------------------------------------");
            String seeDataEndOrNew = scan.nextLine();


            // Here the program checks whether the condition of the while is still meet.
            if (seeDataEndOrNew.contentEquals("y")) {
                dataBSecond = true;
                arrayBoolean = true;
            }else {
                dataBSecond = false;
            }};
         }


            // Here says the program goodbye.
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("We Hope you were satisfied with our program and wish you a nice day. =)");
            System.out.println("-----------------------------------------------------------------------");
            System.exit(0);


}}
