package de.basics.methoden;

public class Main {
    public static void main(String[] args) {
        // Methoden, die einmal angelegt wurde,
        // können immer wieder genutzt werden

        Unterklasse unterklasseObjekt = new Unterklasse();
        String output = unterklasseObjekt.methodeAufrufen();
        System.out.println("Was bist du? ");
        System.out.println(output);
    }
}