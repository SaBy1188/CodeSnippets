package de.basics.vererbung;
// Subklasse, Vererbung

public class Main {
    public static void main(String[] args) {
        Hund hund = new Hund( );
        hund.bellt( );
        hund.setName("Bello");
        hund.setAlter(2);
        hund.setLaut("wuuff");
        hund.schlafen();

        Katze katze = new Katze( );
        katze.schnurrt( );
        katze.setName("Miez");
        katze.setAlter(7);
        katze.setLaut("meooow");

        System.out.println("Die Katze heißt " + katze.getName() +
                " und ist " + katze.getAlter() + " Jahre alt.");
        System.out.println(hund.getName() + " ist " + hund.getAlter() + " ." );
    }
}