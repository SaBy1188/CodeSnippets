package de.basics.konstruktoren;

public class Konstruktoren {
    private int schabloneKonstruktor;
    private String schablone;

    // Konstruktor erstellen
    public Konstruktoren(int schabloneElternklasse,int schabloneKonstruktor, String schablone) {
        // Konstruktor aus Elternklasse einbinden
        super();

        this.schabloneKonstruktor = 0;
        this.schablone = "";
    }
}