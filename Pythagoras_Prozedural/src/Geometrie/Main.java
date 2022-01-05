package Geometrie;

import java.text.MessageFormat;
import java.util.Scanner;
import java.io.Console;


public class Main {

    static double a;
    static double b;
    static double quadrat_a;
    static double quadrat_b;
    static double quadratsumme;
    static double Wurzel;


    public static double Fläche_a() {
        return quadrat_a =  a * a;
    }

    public static double Fläche_b() {
        return quadrat_b = b * b;
    }

    public static double Summe() {
        return quadratsumme = quadrat_a + quadrat_b;
    }

    public static double Wurzel() {
        return Wurzel = Math.sqrt(quadratsumme);
    }

    public static void Anzeige() {
        System.out.println(MessageFormat.format("a im Quadrat = {0}", quadrat_a));
        System.out.println(MessageFormat.format("b im Quadrat = {0}", quadrat_b));
        System.out.println(MessageFormat.format("Quadratsumme von a und b = {0}", quadratsumme));
        System.out.println(MessageFormat.format("Wurzel von a und b = {0}", Wurzel));
    }

    public static void main(String[] args) {
        System.out.println("---------------------------------------------------");
        System.out.println("Pythagoras: c^2 = a^2 + b^2");
        System.out.println("---------------------------------------------------");


        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie einen Wert für a ein:");
        a = scan.nextDouble();

        System.out.println("Geben Sie einen Wert für b ein:");
        b = scan.nextDouble();

        Fläche_a();
        Fläche_b();
        Summe();
        Wurzel();
        Anzeige();
    }
}