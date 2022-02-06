package Geometrie;

import java.io.Console;
import java.text.MessageFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        System.out.println("Pythagoras: c^2 = a^2 + b^2");
        System.out.println("-------------------------------------------");

        double Wurzel_c, a, b, quadrat_a, quadrat_b, quadratsumme;

        //Instanzieren ein Scanner-Objekt
        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie einen Wert für a ein:");
        a = scan.nextDouble();

        System.out.println("Geben Sie einen Wert für b ein");
        b = scan.nextDouble();

        quadrat_a = a * a;
        System.out.println(MessageFormat.format("a im Quadrat = {0}", quadrat_a));

        quadrat_b = b * b;
        System.out.println(MessageFormat.format("b im Quadrat = {0}", quadrat_b));

        quadratsumme = quadrat_a + quadrat_b;
        System.out.println(MessageFormat.format("Quadratsumme von a und b = {0}", quadratsumme));

        Wurzel_c = Math.sqrt(quadratsumme);
        System.out.println(MessageFormat.format("Quadratsumme von a und b = {0}", Wurzel_c));
    }
}
