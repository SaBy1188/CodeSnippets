package de.basics.z_stuff;
//Package zuweisen

import java.util.ArrayList;
import java.util.HashMap;

public class Spickzettel {

    //Klasse erstellen
    //Sichtbarkeit Keyword Name der Klasse
    public class Lernzettel {

        static int    neuerWert;
        final  double KONSTANTE = 9.81; //Konstante: komplett groß
        //Deklarationen der Attribute zuerst (public, private, protected, static, final)
        boolean    Bedingung; //Deklaration (Variable erstellen)
        boolean    BedingungA  = true; //Initialisierung (erstellen & Wert zuweisen)
        boolean    BedingungB;
        boolean    BedingungC;
        int        variable; //Primitiver Datentyp: klein
        String     Text; //Komplexer Datentyp: groß
        //Neues Objekt (mit Namen lernzettel1) der Klasse (Lernzettel) erstellen
        Lernzettel lernzettel1 = new Lernzettel(variable,Text);

        // Konstruktor
        //Objekt (Übergabeparameter)
        Lernzettel(int variable,String Text) { //Standard
            this.variable = variable;
            this.Text = Text;
        }

        // Standard Main Methode
        public static void main(String[] args) {
            // TODO Auto-generated method stub
        }

        //Getter
        public int getVariable( ) { //Standard
            return variable;
        }

        //Setter
        public void setVariable(int neuerWert) { //Standard
            this.neuerWert = neuerWert;
        }

        public boolean codeSpeicher( ) {
            // if-else
            if(Bedingung) {
                befehl( );
            } else {
                befehl( );
            }

            // Mehrfachverzweigung
            if(BedingungA) {
                befehl( );
            } else if(BedingungB) {
                befehl( );
            } else if(BedingungC) {
                befehl( );
            }

            // Switch-Case ohne Break (führt ab dem Fall alles aus)
            switch(variable) {
                case 1: //Variable = 1 => case 1 wird ausgelöst
                    befehl( );
                case 23: //nach case 1 werden alle anderen auch ausgeführt
                    befehl( );
                default:
                    befehl( );
            }

            // Switch-Case mit Break (führt nur den gewünschten einen Fall aus)
            switch(variable) {
                case 1:
                    befehl( );
                    break;
                case 23:
                    befehl( );
                    break;
                default:
                    befehl( );
            }

            // For-Schleife (Zählschleifen)
            for(int i = 0; i < 5; i++) {
                befehl( );
            }

            // While-Schleife (Kopfgesteuert)
            while(Bedingung) {
                befehl( );
                if(BedingungA) { //Sprint zurück zum Kopf
                    continue;
                }
                if(BedingungB) {
                    break; //Springt sofort hinter die Schleife
                }
            }

            // Do-While-Schleife (Fußgesteuert)
            do {
                befehl( );
            } while(Bedingung);

            // Array
            String[] wortListe; //1D Array ohne def. Größe & Werte

            int[]      arrayName = {1,2,3,4}; //1D integer Array mit def. Werten
            double[][] arrayZwei = {{1.5,7},{10,11.7},{1,3}}; //2D double Array

            int[] arrayDrei = new int[5]; //int Array mit 5 Plätzen (erstmal ohne Werte)
            arrayDrei[2] = 5; //Schreibt Wert 5 auf Platz 3 im Array
            // Array-Platz: 0 1 2 3 4
            // Array-Wert: / / 5 / /

            int x = arrayDrei.length; //Ließt Länge des Arrays aus (x=5)

            // For-Each-Schleife
            //Datentyp Iterationsvariable : Datensammlung(z.B. Array oder Liste)
            for(int p : arrayName) {
                befehl( );
            }

            // Collections
            // ArrayList (müssen zu Beginn importiert werden s.o.)
            // v-- komplexer Datentyp -> Wraperklassen (Integer, Double, ...)
            ArrayList<String> listenName; //AL für Strings
            listenName = new ArrayList<String>( );
            listenName.add(Text); //Fügt ein Element hinzu
            listenName.contains(Text); //Abfrage, ob String enthalten (boolean)
            listenName.remove(Text); //Löschst das Element
            listenName.size( ); //Gibt Anzahl an Elementen zurück
            listenName.clear( ); //Entfernt alle Elemente
            listenName.isEmpty( ); //true, falls Collection leer

            // Hash-Map (vorher importieren s.o.)
            HashMap<Integer, String> mapName = new HashMap<Integer, String>( );

            mapName.put(variable,Text); //setzt Element + Wert an gegebener Stelle
            mapName.containsKey(Text); //true, falls Text in Map vorhanden
            mapName.get(variable); //gibt den zu Variable zugehörigen Wert aus
            mapName.remove(variable); //löscht das Element
            mapName.size( ); //Gibt Anzahl an Elementen zurück
            mapName.clear( ); //Löscht alle Elemente
            mapName.isEmpty( ); //true, falls Collection leer

/*
Primitiver Datentyp Wrapperklasse
* byte Byte
* short Short
* int Integer
* long Long
* float Float
* double Double
* char Character
* boolean Boolean
*/
            // Ausgaben
            //ohne Zeilenvorschub
            System.out.print("Hier Text und " + variable + "ausgeben");

            //mit Zeilenvorschub (Text + Enter)
            System.out.println("Text hier");

            //Wraperklasse in Text umwandeln
            System.out.println(Integer.toString(x));

            //gibt true zurück wenn A==B, false : A!=B
            return BedingungA == BedingungB;
        }

        //Modifier Rückgabetyp Methodenname (übergebene Parameter)
        public void methode(int variable) {

        }

        public void befehl( ) {

        }

        //Angabe, dass die Klasse eine Exception wirft
        public void exceptionWerfer( ) throws RuntimeException {

            //Eine Exception werfen
            throw new RuntimeException( );
        }

        public void exceptionVerwerter( ) {

            //Methode, die Exceptions wirft im Try Block
            try {
                befehl( );
                exceptionWerfer( );
            }
            //Exception fangen und dementsprechende Befehle ausführen
            catch(RuntimeException e) {
                befehl( );
            }

        }
/* Interface und Vererbungen

### Klassenkopf mit Interface ###
public class klasseBenutztInterface implements meinInterface{

}

### Interface schreiben ###
public interface meinInterface{
}

### Klassenkopf: Klasse erweitert eine andere Klasse ###
public class extends andereKlasse{

}
### Klassenkopf: Erweitert und implementiert Interface ###
public class extends andereKlasse implements meinInterface{
*/
    }
}