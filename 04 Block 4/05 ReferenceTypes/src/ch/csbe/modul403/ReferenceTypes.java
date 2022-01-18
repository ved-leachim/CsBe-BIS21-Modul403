package ch.csbe.modul403;

import java.text.MessageFormat;

public class ReferenceTypes {

    int day;
    int month;
    int year;

    public void PrintDay(){
        System.out.println(MessageFormat.format("{0}.{1}.{2,number,####}", day, month, year));
    }

    public static void main(String[] args) {

        // PRIMITIVE TYPES - VALUE TYPES
	    // create two int's
        int i1 = 1;
        int i2 = 2;

        //print them to the console
        System.out.println(MessageFormat.format("i1: {0}, i2: {1}", i1, i2));

        // modify the second integer
        i2 = 17;
        // print them once more to the console
        System.out.println(MessageFormat.format("i1: {0}, i2: {1}", i1, i2));

        // NON-PRIMITIVE TYPES - REFERENCE TYPES
        // create a Date
        ReferenceTypes d1 = new ReferenceTypes();
        d1.day = 25;
        d1.month = 8;
        d1.year = 2014;

        // create a second reference to this Date
        ReferenceTypes d2 = d1;

        // print Date using the first reference
        d1.PrintDay();

        // assign a new day to the second reference
        d2.month = 12;
        d2.day = 14;

        // print Date using first reference
        d1.PrintDay();
    }
}
