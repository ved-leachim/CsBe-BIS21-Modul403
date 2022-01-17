package ch.csbe.modul403;

import java.util.Scanner;

public class SumOfEvenNumbers {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int userInput;

        System.out.println("=========================================");
        System.out.println("Willkommen beim Delta Geradenummernzähler");
        System.out.println("=========================================");
        System.out.println("Bitte geben Sie eine Zahl ein, die grösser als 2 ist:");

        userInput = Integer.parseInt(scanner.nextLine());
        if (userInput <= 2) {
            System.out.println("Hey kannst du nicht lesen, grösser als 2!");
            System.out.println("Programm wird beendet!");
            System.exit(0);
        }

        int currentNumber = 2;
        int sumOfEvenNumbers = 0;

        while (currentNumber < userInput) {
            sumOfEvenNumbers += currentNumber;
            currentNumber += 2;
        }
        System.out.println("Die Summe aller geraden Zahlen zwischen 1 und inkl. " + userInput + " beträgt: " + sumOfEvenNumbers);
    }
}
