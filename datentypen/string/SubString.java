package de.basics.datentypen.string;

public class SubString {
    public static void main(String[] args) {
        // S T R I N G: S U B S T R I N G
        /**Substrings extrahieren Zeichen.
         * Die Methode subString() hat zwei Parameter:
         * Einen Anfang und ein Ende.*/

        String iBANString1 = "DE12345678912345678912";
        String iBANString2 = "DE12345678934345678912";

        getIBANDetail(iBANString1);
        getIBANDetail(iBANString2);
    }

    private static void getIBANDetail(String iban) {
        String strLandzeichen;
        String strPruefziffer;
        String strBLZ;
        String strKontonummer;

        strLandzeichen = iban.substring(0,2);
        strPruefziffer = iban.substring(2,4);
        strBLZ = iban.substring(4,12);
        strKontonummer = iban.substring(12,22);
    }
}