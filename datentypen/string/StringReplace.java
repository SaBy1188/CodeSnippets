package de.basics.datentypen.string;

public class StringReplace {
    public static void main(String[] args) {
        // S T R I N G: R E P L A C E
        /**Wird zur Textersetzung genutzt.*/

        String anredeString = "Sehr geehrte Herr/Frau...";
        String usernameString = "Frau Müller";

        /**Replace soll nun die "..." durch den abgefragten Username ersetzen.*/
        String newAnredeString = anredeString.replace("Herr/Frau...", usernameString); // Leerzeichen hinzufügen , " " + usernameString
        System.out.println(newAnredeString);
    }
}