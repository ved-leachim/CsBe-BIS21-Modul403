package ch.csbe.modul403;

import java.util.Scanner;

public class Main {

    public static double length;
    public static double width;

    public static void main(String[] args) {
        double result;

        getInputData();
        result = calculate(length, width);
        printResult(result);
    }

    private static void getInputData() {

        // Collect information
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie Bitte die Länge des Rechtecks an:");
        length = scanner.nextDouble();
        System.out.println("Geben Sie Bitte die Breite des Rechtecks an:");
        width = scanner.nextDouble();
    }

    private static double calculate(double laenge, double breite) {
        // Calculation
        return (laenge * breite);
    }

    private static void printResult (double result) {
        // PrintOut
        System.out.println("Die Fläche des Rechtecks beträgt: " + result);
    }

}
