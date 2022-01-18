package ch.csbe.modul403;

import java.text.MessageFormat;

public class Datentypen {

    public static void main(String[] args) {

        System.out.println("-------------------------------------------");
        System.out.println("Datentypen in Java: Wertetypen:");
        System.out.println("Die Grössen aller primitiven Datentypen in Java");
        System.out.println("-------------------------------------------");

        byte charSpaceInRAM = Character.SIZE;
        byte byteSpaceInRAM = Byte.SIZE;
        byte shortSpaceInRAM = Short.SIZE;
        byte integerSpaceInRAM = Integer.SIZE;
        byte longSpaceInRAM = Long.SIZE;
        byte floatSpaceInRAM = Float.SIZE;
        byte doubleSpaceInRAM = Double.SIZE;

        byte[] sizesOfValueTypes = new byte[] {charSpaceInRAM, byteSpaceInRAM,shortSpaceInRAM,
                integerSpaceInRAM, longSpaceInRAM, floatSpaceInRAM, doubleSpaceInRAM};
        String[] nameOfValueTypes = new String[] {"char", "byte", "short", "integer", "long", "float", "double"};

        for (byte i = 0; i < sizesOfValueTypes.length; i++){
            long positiveValueRange = (long) (Math.pow(2, sizesOfValueTypes[i] - 1)) - 1;
            long negativeValueRange = -positiveValueRange -1;
            System.out.println(MessageFormat.format("Der Datentyp {0} hat eine Grösse " +
                    "von {1} Byte und kann Werte von {2} bis {3} abspeichern."
                    ,nameOfValueTypes[i], sizesOfValueTypes[i], negativeValueRange, positiveValueRange));
        }
    }
}
