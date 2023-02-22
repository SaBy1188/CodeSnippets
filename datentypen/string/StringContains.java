package de.basics.datentypen.string;

public class StringContains {
    public static void main(String[] args) {
        // S T R I N G: C O N T A I N S
        /**Bei Contains wird nach bestimmten Zeichen im Text gesucht.*/

        String iBANString1 = "DE12341234912345678912";
        String iBANString2 = "DE194565678934345678912";

        getIBANDetail(iBANString1);
        getIBANDetail(iBANString2);

        String blzDBString = "12341234";
        String blzCommerzbankString = "19456567";


        // C O N T A I N S
        if (iBANString1.contains(blzDBString)) {
            System.out.println("Konto bei der Deutschen Bank.");
        }

        if (iBANString2.contains(blzCommerzbankString)) {
            System.out.println("Konto bei der Commerzbank.");
        }
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