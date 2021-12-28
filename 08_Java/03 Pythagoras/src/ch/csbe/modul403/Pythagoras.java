package ch.csbe.modul403;

import java.text.MessageFormat;
import java.util.Scanner;

public class Pythagoras {

    static double a, b, c;

    static double quadrat_a;
    static double quadrat_b;
    static double quadratsumme;

    public static void main(String[] args) {
        begruessung();
        eingabe();
        berechnung();
        ausgabe();
    }

    public static void begruessung(){
        System.out.println("------------------------------------------------");
        System.out.println("Pythagoras: c^2 = a^2 + b^2");
        System.out.println("------------------------------------------------");
    }

    public static void eingabe(){
        //Instanziieren ein Scanner-Objekt
        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie einen Wert für a ein:");
        a = scan.nextDouble();

        System.out.println("Geben Sie einen Wert für b ein:");
        b = scan.nextDouble();
    }

    public static void berechnung(){
        quadrat_a = a * a;
        quadrat_b = b * b;
        quadratsumme = quadrat_a + quadrat_b;
        c = Math.sqrt(quadratsumme);
    }

    public static void ausgabe(){
        System.out.println(MessageFormat.format("a im Quadrat = {0}", quadrat_a));
        System.out.println(MessageFormat.format("b im Quadrat = {0}", quadrat_b));
        System.out.println(MessageFormat.format("Quadratsumme von a und b = {0}", quadratsumme));
        System.out.println(MessageFormat.format("Die Seitenlänge c ist = {0}", c));
    }

}
