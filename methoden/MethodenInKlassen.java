package de.basics.methoden;

public class MethodenInKlassen {
    public static void main(String[] args) {
        // Methode in der Main Methode aufrufen.
        System.out.println("Ich brauche eine Methode.");

        methode1( );
        methode2( );
        System.out.println(intMethode(3,5));
    }

    // Methode anlegen: Was soll sie tun?
    // Eine VOID Methode gibt nichts zurück, daher kein "return" nötig
    private static void methode1( ) {
        String text = "Bin schon da!";
        System.out.println(text);
    }

    // Daher kann man Methoden einen Rückgabewert geben
    private static String methode2( ) {
        String satz = "Ich bin auch eine Methode. Braucht mich keiner?";
        System.out.println(satz);
        return satz;
    }

    private static int intMethode(int x,int y) {
        int result = x * y;
        return result;
    }
}