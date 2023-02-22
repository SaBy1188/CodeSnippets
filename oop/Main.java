package de.basics.oop;

public class Main {

    // Methode aufrufen
    // <Klassenname> <Objektname> = neues Objekt <new> <Klassenname>
    public static void main(String[] args) {
        Bauplan bauplan = new Bauplan("Attribut", 1, true);
        System.out.println(bauplan);
    }
}