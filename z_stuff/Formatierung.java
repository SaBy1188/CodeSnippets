package de.basics.z_stuff;

public class Formatierung {
    public static void main(String[] args) {
    // D E C I M A L  F O R M A T T E R
        final java.text.DecimalFormat twoDigits = new java.text.DecimalFormat("##,###.0" );

        double beispielZahl = 5847204.783;
        System.out.println(twoDigits.format(beispielZahl));


    // T E X T  F O R M A T T E R
        String centeredText = "Lorem Ipsumwwefc wcc"
                + " wnwkjnCON"
                + "WNONC nwekn ";

        System.out.println(centeredText);
    }
}