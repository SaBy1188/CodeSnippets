package de.basics.datentypen.string;

public class StringToInteger {
    public static void main(String[] args) {

        // Anmerkung: Umwandlung von Strng in double
        // double v = Double.parseDouble(u);

        // parseInt-Methode > Nur Ausgabe, kein Speichern in einer Variable
        String str = "102";
        //int x = Integer.parseInt(str);
        System.out.println(Integer.parseInt(str) + 3); // RICHTIG: Das Summieren funktioniert hier.

        // parseInt-Methode > Alternative, wenn keine String-Variable vorhanden ist.
        System.out.println(Integer.parseInt("105") + 3);

        // parseInt-Methode > Den in int umgewandelten String in einer Variable speichern.
        String u = "45";
        int    v = Integer.parseInt(u);
        System.out.println(v + 3);     // RICHTIG: Das Summieren funktioniert hier.

        // valueOf-Methode > Der in int umgewandelte String in einer Variable speichern.
        String w = "60";
        int    x = Integer.valueOf(w);
        System.out.println(x + 1);

        // FALSCH: Das funktioniert nicht!
        String t = "10";
        System.out.println(Integer.parseInt(t)); // Hier wird die int-Zahl in keiner Variable gespeichert!
        System.out.println(t + 2);
    }
}