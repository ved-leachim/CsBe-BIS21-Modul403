package aufgaben;

import java.util.Scanner;

public class RechteckBerechnen {
    public static void main(String[] args) {

        //Erfassen der Werte

        Scanner scanner = new Scanner(System.in);

        double laenge;
        double breite;
        double resultat;

        System.out.println("Geben sie bitte die Länge des Rechteckes an:");
        laenge = scanner.nextDouble();
        System.out.println("Geben sie bitte die Breite des Rechteckes ein:");
        breite = scanner.nextDouble();
        //Bearbeitung
        resultat = laenge * breite;
        //Ausgabe
        System.out.println("Die Fläche des Rechteckes beträgt :" + resultat);
    }
}
