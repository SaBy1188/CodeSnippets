package de.basics.datentypen.string;

public class StringLUCase {
    public static void main(String[] args) {
        // S T R I N G: L O W E R / U P P E R  C A S E
        /**Text zu Groß- bzw. Kleinbuchstaben abändern.*/

        String nameString = "aNDy wOo";

        // L O W E R  C A S E
        String nameLowerCase = nameString.toLowerCase();

        // U P P E R  C A S E
        String nameUpperCase = nameString.toUpperCase();

        System.out.println("Original Eingabe: " + nameString);
        System.out.println("Klein: " + nameLowerCase);
        System.out.println("Groß: " + nameUpperCase);
    }
}