package de.basics.datentypen;

public class DatentypenCasten {
    public static void main(String[] args) {
        // D A T E N T Y P E N  U M W A N D E L N
        // C A S T E N

        /** 1. Implizites Casten
         * (Datenverlustfrei; von klein zu groß)
         */
        int ganzZahl = 20;
        double kommaZahl;                           // Deklaration
        kommaZahl = ganzZahl;                       // Initialisierung
        System.out.println(ganzZahl);
        System.out.println(kommaZahl);


        /** 2. Explizites Casten
         * (Datenverlust; von groß zu klein)
         */
        int kommaZahl1 = (int)345.234;              // Nachkommastellen werden abgeschnitten
        System.out.println(kommaZahl1);

        double nutzerEingabe = 45.73002400122350012;
        int nutzerEingabeInt = (int)nutzerEingabe;
        System.out.println(nutzerEingabeInt);

        float doubleToFloat = (float)nutzerEingabe; // double zu float
        System.out.println("Double to Float: " + doubleToFloat);
    }
}