package ch.csbe.modul403;

import java.text.MessageFormat;

public class BoxingUnboxing {

    public static void main(String[] args) {
	    // Variablendeklaration und Wertzuweisung
        int i = 10101010;
        // -----------------------------------------------
        // Boxing kopiert den Wert von i in das Objekt o.
        // ------------------------------------------------
        // Frühere Syntax:
        // Integer o = new Integer(i);
        Integer o = i;
        i = 90909090;
        // Die neue Wertzuweisung für i hat keinen Einfluss auf o
        System.out.println(MessageFormat.format("Value-type i-value = {0}", i));
        System.out.println(MessageFormat.format("Reference-Type o-value boxed from i = {0}", o));
        // ------------------------------------------------
        // Unboxing kopiert den Wert von o in das Objekt j.
        // ------------------------------------------------
        int j = (int) o;
        System.out.println(MessageFormat.format("Value-type j-value unboxed from o = {0}", j));

    }
}
