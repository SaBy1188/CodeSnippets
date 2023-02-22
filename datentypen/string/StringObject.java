package de.basics.datentypen.string;

public class StringObject {
    public static void main(String[] args) {
        // O B J E K T E
        // Strings = Literale

        String nameString1 = "Peter Müller";
        // Datentyp String = Klasse
        // Aus einer Klasse erstellt man Objekte

        String nameString2 = new String("Frank Müller"); // new eröffnet blauen Objekt Container
        String nameString3 = new String("Frank Müller");


        // S T R I N G S  V E R G L E I C H E N
        /* Strings können verglichen werden, da ein String
        lediglich eine Aneinanderreihung von Zeichen ist.
        Jedes dieser Zeichen hat einen Index.
         */

            // Ä Q U I V A L E N Z O P E R A T O R (==)
            /**Hierbei wird nicht der "Inhalt" ("Frank Müller")  verglichen,
             * sondern die komplette "Kiste" (String ... "Frank Müller").
             * Die Objekte "Kisten" haben unterschiedliche Nummerierungen im
             * Arbeitsspeicher. Daher können diese niemals identisch sein.
             *
             * Equals Operatoren funktionieren nur bei primitiven Datentypen:
             * Beispiel int = 5; int = 7 -> 5 == 7*/

        if (nameString2 == nameString3) {
            System.out.println("Beide sind gleich");
        } else {
            System.out.println("Beide sind nicht gleich");
        }

            // V E R G L E I C H S O P E R A T O R (equals)
            /**Hierbei wird der tatsächliche Inhalt, innerhalb des Objektes verglichen*/

        if (nameString2.equals(nameString3)) {
            System.out.println("Beide sind gleich");
        } else {
            System.out.println("Beide sind nicht gleich");
        }
    }
}