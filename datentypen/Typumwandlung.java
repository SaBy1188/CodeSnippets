package de.basics.datentypen;

public class Typumwandlung {
    public static void main(String[] args) {
        // Einschränkende explizite Umwandlung

        int x = 128;
        System.out.println("x : " + x);

        byte y = (byte) x;
        System.out.println("y = (byte) x : " + y);


        // Erweiterte implizite Typumwandlung
        short a = 100;
        System.out.println("a : " + a);

        float b = (float) a;
        System.out.println("b = (float) a : " + b);
    }
}