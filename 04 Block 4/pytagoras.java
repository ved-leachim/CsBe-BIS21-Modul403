package geometrie;


import java.util.Scanner;

public class pytagoras {
    //Initialsierung der Werte
    private static double KatheteA;
    private static double KatheteB;
    public static void main(String[] args) {
    double result;

        //Ablauf des Programms
        getInputData();
        result = calculate();
        outPut(result);
    }

        // Daten einspielen über Konsole
    public static void getInputData()
        {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Bitte geben sie die Kathete A ein");
            KatheteA = scanner.nextDouble();
            System.out.println("Bitte geben Sie die Kathete B ein");
            KatheteB = scanner.nextDouble();



        }
        public static double calculate ()
        {
            double Result;

            Result = (KatheteA * KatheteA) + (KatheteB * KatheteB);
            return Result;

        }
        public static void outPut(double result)
        {

            System.out.println("Die Hypotenuse beträgt:" + result);
        }
    }

