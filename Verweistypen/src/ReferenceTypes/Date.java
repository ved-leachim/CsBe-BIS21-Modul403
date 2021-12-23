package ReferenceTypes;

import java.text.MessageFormat;

public class Date {

    int day;
    int month;
    int year;

    public void PrintDay() {
        System.out.println(MessageFormat.format("{0}.{1}.{2,number,####}", day, month, year));
    }

    public static void main(String[] args) {
	// zwei int`s erstellen
        int i1 = 1;
        int i2 = 1;

        //Print them to the console
        System.out.println(MessageFormat.format("i1: {0}, i2: {1}", i1, i2));

        //modify the second integer
        i2 = 17;
        //print them once more to the console
        System.out.println(MessageFormat.format("i1: {0}, i2: {2}", i1, i2));

        // create a Date
        Date d1 = new Date();

    }
}
