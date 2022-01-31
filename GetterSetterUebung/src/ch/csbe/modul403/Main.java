package ch.csbe.modul403;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        int x = 1;


        Scanner userInput = new Scanner(System.in);

        Person person = null;
        while (x <= 2) {

            person = new Person();
            System.out.println("Geben sie den Vornamen an:");
            person.setFirstName(userInput.nextLine());
            System.out.println("Geben sie den Nachnamen an:");
            person.setLastName(userInput.nextLine());
            System.out.println("Geben sie das Alter an:");
            person.setAge(userInput.nextInt());

            //System.out.println("Führt die person einen eigenen Haushalt?:");
            //person1.setHasItsOwnHousehold(userInput.nextBoolean());
            //System.out.println("Geben sie die Strasse an:");

            x++;

        }
        System.out.println(person.getFirstName());

        /*

        if (person1.getHasItsOwnHousehold()) {
            person1.setStreet(userInput.nextLine());
            System.out.println("Geben sie den Wohnort an:");
            person1.setCity(userInput.nextLine());
        }
*/


/*
        System.out.println("Name:    " + person1.getFirstName() + " " + person1.getLastName());
        System.out.println("Alter:   " + person1.getAge());
        }
*/


    }}