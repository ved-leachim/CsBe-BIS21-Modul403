package ch.modul403;

import jdk.internal.icu.lang.UCharacterDirection;


import java.util.Scanner;

public class CalendarEvent {

    private static UCharacterDirection arrays;
    private static int s;


    public void eingabe() {


        System.out.println("Bitte geben Sie den Titel des Events ein:");
        arrayEinlesen();

        System.out.println("Bitte geben Sie das Datum des Events ein:");
        arrayEinlesen();

        System.out.println("Bitte geben Sie die Startzeit des Events ein:");
        arrayEinlesen();

        System.out.println("Bitte geben Sie die Dauer des Events ein:");
        arrayEinlesen();

        System.out.println(arrays.toString(s));

    }

        public void arrayEinlesen () {


        Scanner in = new Scanner(System.in);
        String[] s = new String[3];
        String j = in.next(String.valueOf(s));

    }   }







