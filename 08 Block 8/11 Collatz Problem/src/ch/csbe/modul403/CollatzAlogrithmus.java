package ch.csbe.modul403;

import java.util.Scanner;

public class CollatzAlogrithmus {

    static long userInput;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        userInput = Long.parseLong(scanner.nextLine());

        if (userInput % 2 == 0) {
            evenNumber(userInput);
        } else {
            oddNumber(userInput);
        }

    }

    public static void evenNumber(long evenNumber) {
        userInput = userInput / 2;
        System.out.println(userInput);
        if (userInput != 1) {
            if (userInput % 2 == 0)
                evenNumber(userInput);
            else oddNumber(userInput);
        }
    }

    public static void oddNumber (long oddNumber) {
        userInput = 3 * userInput + 1;
        System.out.println(userInput);
        if (userInput != 1) {
            if (userInput % 2 != 0)
                oddNumber(userInput);
            else
                evenNumber(userInput);
        }
    }
}
