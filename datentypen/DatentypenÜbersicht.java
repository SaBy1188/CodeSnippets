package de.basics.datentypen;

public class DatentypenÜbersicht {
    public static void main(String[] args) {
        // D A T E N T Y P E N  Ü B E R S I C H T


        // P R I M I T I V E  D A T E N T Y P E N
         /** Es gibt 8 primitive Datentypen:
          * byte, short, int, long, float, double, boolean, char
         */

        // 4 primitive Datentypen für Ganzzahlen

        // BYTE     8 bit = 1 byte
        System.out.println("BYTE\nMax Wert: " + Byte.MAX_VALUE + "\nMin Wert: " + Byte.MIN_VALUE
        + "\nSpeichergröße in Bits: " + Byte.SIZE);

        // SHORT    16 bit = 2 byte
        System.out.println("\nSHORT\nMax Wert: " + Short.MAX_VALUE + "\nMin Wert: " + Short.MIN_VALUE
        + "\nSpeichergröße in Bits: " + Short.SIZE);

        // INT      32 bit = 4 byte
        System.out.println("\nINT\nMax Wert: " + Integer.MAX_VALUE + "\nMin Wert: " + Integer.MIN_VALUE
        + "\nSpeichergröße in Bits: " + Integer.SIZE);

        // LONG     64 bit = 8 byte
        System.out.println("\nLONG\nMax Wert: " + Long.MAX_VALUE + "\nMin Wert: " + Long.MIN_VALUE
        + "\nSpeichergröße in Bits: " + Long.SIZE);


        // 2 primitive Datentypen für Kommazahlen

        // FLOAT    7 Nachkommastellen; 32 bit = 4 byte
        System.out.println("\nFLOAT\nMax Wert: " + Float.MAX_VALUE + "\nMin Wert: " + Float.MIN_VALUE
        + "\nSpeichergröße in Bits: " + Float.SIZE);

        // DOUBLE   15 Nachkommastellen; 64 bit = 8 byte
        System.out.println("\nDOUBLE\nMax Wert: " + Double.MAX_VALUE + "\nMin Wert: " + Double.MIN_VALUE
        + "\nSpeichergröße in Bits: " + Double.SIZE);


        // Datentyp mit zwei Wahrheitswerten
        boolean trueOrFalse = true;         // = false; 8 bit = 1 byte
        System.out.println(trueOrFalse);


        // Datentyp mit Zeichencharakter
        char character = '@';               // 16 bit = 2 byte
        System.out.println(character);



        /** String gehört nicht zu den primitiven Datentypen
         * er zählt zu Objekten
         */
        String name = "Sabrin Byaah";
        System.out.println(name.length()); // Methode length gibt die Länge der Variable aus



        // D A T E N T Y P  W E R T Ü B E R S C H R E I B U N G
        // Beispiel: Highscores
        byte highscore = 1;
        highscore = 10;
        highscore = 100;

        System.out.println(highscore);
    }
}